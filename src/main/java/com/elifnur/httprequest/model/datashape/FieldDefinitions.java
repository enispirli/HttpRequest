package com.elifnur.httprequest.model.datashape;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FieldDefinitions {
	private FieldDefinitionItem currentStatus;
	@JsonProperty("PowerPlant")
	private FieldDefinitionItem PowerPlant;
	private FieldDefinitionItem gen1hr;
	private FieldDefinitionItem capacity;
	@JsonProperty("PowerPlantDescription")
	private FieldDefinitionItem PowerPlantDescription;
	private FieldDefinitionItem gen1min;
	private FieldDefinitionItem gen15min;
	private FieldDefinitionItem fuelType;
	private FieldDefinitionItem gen1day;
	private FieldDefinitionItem location;
	private FieldDefinitionItem gen1dayDateTime;
	private FieldDefinitionItem gen1minDateTime;
	private FieldDefinitionItem meter;
	private FieldDefinitionItem gen1hrDateTime;
	private FieldDefinitionItem description;
	private FieldDefinitionItem gen15minDateTime;

	public FieldDefinitionItem getGen15minDateTime() {
		return gen15minDateTime;
	}

	public void setGen15minDateTime(FieldDefinitionItem gen15minDateTime) {
		this.gen15minDateTime = gen15minDateTime;
	}

	public FieldDefinitionItem getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(FieldDefinitionItem currentStatus) {
		this.currentStatus = currentStatus;
	}

	public FieldDefinitionItem getPowerPlant() {
		return PowerPlant;
	}

	public void setPowerPlant(FieldDefinitionItem powerPlant) {
		this.PowerPlant = powerPlant;
	}

	public FieldDefinitionItem getGen1hr() {
		return gen1hr;
	}

	public void setGen1hr(FieldDefinitionItem gen1hr) {
		this.gen1hr = gen1hr;
	}

	public FieldDefinitionItem getCapacity() {
		return capacity;
	}

	public void setCapacity(FieldDefinitionItem capacity) {
		this.capacity = capacity;
	}

	public FieldDefinitionItem getPowerPlantDescription() {
		return PowerPlantDescription;
	}

	public void setPowerPlantDescription(FieldDefinitionItem powerPlantDescription) {
		this.PowerPlantDescription = powerPlantDescription;
	}

	public FieldDefinitionItem getGen1min() {
		return gen1min;
	}

	public void setGen1min(FieldDefinitionItem gen1min) {
		this.gen1min = gen1min;
	}

	public FieldDefinitionItem getGen15min() {
		return gen15min;
	}

	public void setGen15min(FieldDefinitionItem gen15min) {
		this.gen15min = gen15min;
	}

	public FieldDefinitionItem getFuelType() {
		return fuelType;
	}

	public void setFuelType(FieldDefinitionItem fuelType) {
		this.fuelType = fuelType;
	}

	public FieldDefinitionItem getGen1day() {
		return gen1day;
	}

	public void setGen1day(FieldDefinitionItem gen1day) {
		this.gen1day = gen1day;
	}

	public FieldDefinitionItem getLocation() {
		return location;
	}

	public void setLocation(FieldDefinitionItem location) {
		this.location = location;
	}

	public FieldDefinitionItem getGen1dayDateTime() {
		return gen1dayDateTime;
	}

	public void setGen1dayDateTime(FieldDefinitionItem gen1dayDateTime) {
		this.gen1dayDateTime = gen1dayDateTime;
	}

	public FieldDefinitionItem getGen1minDateTime() {
		return gen1minDateTime;
	}

	public void setGen1minDateTime(FieldDefinitionItem gen1minDateTime) {
		this.gen1minDateTime = gen1minDateTime;
	}

	public FieldDefinitionItem getMeter() {
		return meter;
	}

	public void setMeter(FieldDefinitionItem meter) {
		this.meter = meter;
	}

	public FieldDefinitionItem getGen1hrDateTime() {
		return gen1hrDateTime;
	}

	public void setGen1hrDateTime(FieldDefinitionItem gen1hrDateTime) {
		this.gen1hrDateTime = gen1hrDateTime;
	}

	public FieldDefinitionItem getDescription() {
		return description;
	}

	public void setDescription(FieldDefinitionItem description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "FieldDefinitions [currentStatus=" + currentStatus + ", PowerPlant=" + PowerPlant + ", gen1hr=" + gen1hr
				+ ", capacity=" + capacity + ", PowerPlantDescription=" + PowerPlantDescription + ", gen1min=" + gen1min
				+ ", gen15min=" + gen15min + ", fuelType=" + fuelType + ", gen1day=" + gen1day + ", location="
				+ location + ", gen1dayDateTime=" + gen1dayDateTime + ", gen1minDateTime=" + gen1minDateTime
				+ ", meter=" + meter + ", gen1hrDateTime=" + gen1hrDateTime + ", description=" + description
				+ ", gen15minDateTime=" + gen15minDateTime + "]";
	}

}
