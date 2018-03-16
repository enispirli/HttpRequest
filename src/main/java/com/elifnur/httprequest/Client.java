package com.elifnur.httprequest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;

import com.elifnur.httprequest.model.QueryResponse;
import com.elifnur.httprequest.model.rows.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Client {

	private StringBuilder stringBuilder = new StringBuilder();
	private File minuteRedingsFile = new File("elifnur_ispirli_minutereadings.csv");
	private File powerPlantsFile = new File("powerplants.csv");
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

	public StringBuffer sendRequest(String url) throws Exception {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("AppKey", "9a3ab6d8-9ffe-49a5-8194-bc7d61123f4a");

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
			response.append(" ");
		}
		in.close();
		return response;
	}

	public QueryResponse createQueryResponseObjectFromJson(StringBuffer response) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		return objectMapper.readValue(response.toString(), QueryResponse.class);

	}

	public void writeTopowerPlantsFile(QueryResponse queryResponse) throws Exception {

		if (!powerPlantsFile.exists()) {
			powerPlantsFile.createNewFile();
		}
		FileWriter fileWriter = new FileWriter(powerPlantsFile, false);
		BufferedWriter bWriter = new BufferedWriter(fileWriter);
		stringBuilder.append("Power Plant").append(",").append("Meter").append("\n");

		for (Customer responce : queryResponse.getRows()) {
			stringBuilder.append(responce.getPowerPlant()).append(",").append(responce.getMeter()).append("\n");

		}

		bWriter.write(stringBuilder.toString());
		bWriter.close();

	}

	public void writeTominuteRedingsFileHeader() {
		stringBuilder.append("Power Plant ").append(",").append("Energy Generation").append(",").append("Time Stamp")
				.append(",").append("Date Time").append("\n");

	}

	public void writeTominuteRedingsFile(QueryResponse queryResponse) throws Exception {

		if (!minuteRedingsFile.exists()) {
			minuteRedingsFile.createNewFile();
		}

		FileWriter fileWriter = new FileWriter(minuteRedingsFile, false);
		BufferedWriter bWriter = new BufferedWriter(fileWriter);

		for (Customer responce : queryResponse.getRows()) {
			stringBuilder.append(responce.getPowerPlant()).append(",").append(responce.getGen1min()).append(",")
					.append(responce.getGen1minDateTime().getTime()).append(",")
					.append(simpleDateFormat.format(responce.getGen1minDateTime())).append("\n");
		}

		bWriter.write(stringBuilder.toString());
		bWriter.close();

	}
}
