package com.elifnur.httprequest.model.datashape;

public class DataShape {

	private FieldDefinitions fieldDefinitions;

	public FieldDefinitions getFieldDefinitions() {
		return fieldDefinitions;
	}

	public void setFieldDefinitions(FieldDefinitions fieldDefinitions) {
		this.fieldDefinitions = fieldDefinitions;
	}

	@Override
	public String toString() {
		return "DataShape [fieldDefinitions=" + fieldDefinitions + "]";
	}

}
