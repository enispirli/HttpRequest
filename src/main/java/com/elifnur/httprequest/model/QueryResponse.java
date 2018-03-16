package com.elifnur.httprequest.model;

import java.util.List;

import com.elifnur.httprequest.model.datashape.DataShape;
import com.elifnur.httprequest.model.rows.Customer;

public class QueryResponse {

	private DataShape dataShape;
	private List<Customer> rows;

	public DataShape getDataShape() {
		return dataShape;
	}

	public void setDataShape(DataShape dataShape) {
		this.dataShape = dataShape;
	}

	public List<Customer> getRows() {
		return rows;
	}

	public void setRows(List<Customer> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "QueryResponse [dataShape=" + dataShape + ", rows=" + rows + "]";
	}

}
