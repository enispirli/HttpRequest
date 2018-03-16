package com.elifnur.httprequest.model.datashape;

public class FieldDefinitionItem {
	private String name;
	private String description;
	private String baseType;
	private int ordinal;
	private Aspects aspects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public Aspects getAspects() {
		return aspects;
	}

	public void setAspects(Aspects aspects) {
		this.aspects = aspects;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name :" + getName());
		sb.append("Description :" + getDescription());
		sb.append("Base Type :" + getBaseType());
		sb.append("Ordinal :" + getOrdinal());
		sb.append("Aspects :" + getAspects());
		return sb.toString();
	}

}
