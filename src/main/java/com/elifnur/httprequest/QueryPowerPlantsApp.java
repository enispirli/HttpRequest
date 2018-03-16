package com.elifnur.httprequest;

import com.elifnur.httprequest.model.QueryResponse;

public class QueryPowerPlantsApp {
	public static void main(String[] args) throws Exception {

		if (args == null || args.length == 0) {
			System.out.println("Lütfen çalıştırma parametresi giriniz.");
			return;
		}

		String param = args[0];

		if (param.equals("q")) {
			new QueryPowerPlantsApp().queryPowerPlants();
		} else if (param.equals("m")) {
			new QueryPowerPlantsApp().queryEnergyGeneration();
		} else {
			System.out.println("Geçersiz parametre girdiniz.");
		}
	}

	private void queryPowerPlants() throws Exception {
		String url = "https://power.ivyiot.com/Thingworx/Things/GamaNetworkServices/Services/GetNetworkData";
		Client client = new Client();
		StringBuffer response = client.sendRequest(url);
		QueryResponse queryResponse = client.createQueryResponseObjectFromJson(response);
		client.writeTopowerPlantsFile(queryResponse);
	}

	private void queryEnergyGeneration() throws Exception {
		String url = "https://power.ivyiot.com/Thingworx/Things/GamaNetworkServices/Services/GetNetworkData";
		Client client = new Client();
		client.writeTominuteRedingsFileHeader();
		while (true) {
			StringBuffer response = client.sendRequest(url);
			QueryResponse queryResponse = client.createQueryResponseObjectFromJson(response);
			client.writeTominuteRedingsFile(queryResponse);
			try {
				// thread to sleep for 1000 milliseconds
				Thread.sleep(1000 * 60);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}