package com.elifnur.httprequest.model.rows;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	private String meter;
	private String description;
	@JsonProperty("PowerPlantDescription")
	private String PowerPlantDescription;
	@JsonProperty("PowerPlant")
	private String PowerPlant;
	private boolean currentStatus;
	private float gen1hr;
	private float gen1min;
	private float gen15min;
	private int fuelType;
	private float gen1day;
	private float capacity;
	private Date gen1dayDateTime;
	private Date gen1minDateTime;
	private Date gen1hrDateTime;
	private Date gen15minDateTime;
	private Location location;

	public Date getGen15minDateTime() {
		return gen15minDateTime;
	}

	public void setGen15minDateTime(Date gen15minDateTime) {
		this.gen15minDateTime = gen15minDateTime;
	}

	public String getMeter() {
		return meter;
	}

	public void setMeter(String meter) {
		this.meter = meter;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(boolean currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getPowerPlant() {
		return PowerPlant;
	}

	public void setPowerPlant(String powerPlant) {
		this.PowerPlant = powerPlant;
	}

	public Date getGen1hrDateTime() {
		return gen1hrDateTime;
	}

	public void setGen1hrDateTime(Date gen1hrDateTime) {
		this.gen1hrDateTime = gen1hrDateTime;
	}

	public float getGen1hr() {
		return gen1hr;
	}

	public void setGen1hr(float gen1hr) {
		this.gen1hr = gen1hr;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public String getPowerPlantDescription() {
		return PowerPlantDescription;
	}

	public void setPowerPlantDescription(String powerPlantDescription) {
		this.PowerPlantDescription = powerPlantDescription;
	}

	public float getGen1min() {
		return gen1min;
	}

	public void setGen1min(float gen1min) {
		this.gen1min = gen1min;
	}

	public float getGen15min() {
		return gen15min;
	}

	public void setGen15min(float gen15min) {
		this.gen15min = gen15min;
	}

	public int getFuelType() {
		return fuelType;
	}

	public void setFuelType(int fuelType) {
		this.fuelType = fuelType;
	}

	public float getGen1day() {
		return gen1day;
	}

	public void setGen1day(float gen1day) {
		this.gen1day = gen1day;
	}

	public Date getGen1dayDateTime() {
		return gen1dayDateTime;
	}

	public void setGen1dayDateTime(Date gen1dayDateTime) {
		this.gen1dayDateTime = gen1dayDateTime;
	}

	public Date getGen1minDateTime() {
		return gen1minDateTime;
	}

	public void setGen1minDateTime(Date gen1minDateTime) {
		this.gen1minDateTime = gen1minDateTime;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [meter=" + meter + ", description=" + description + ", PowerPlantDescription="
				+ PowerPlantDescription + ", PowerPlant=" + PowerPlant + ", currentStatus=" + currentStatus
				+ ", gen1hr=" + gen1hr + ", gen1min=" + gen1min + ", gen15min=" + gen15min + ", fuelType=" + fuelType
				+ ", gen1day=" + gen1day + ", capacity=" + capacity + ", gen1dayDateTime=" + gen1dayDateTime
				+ ", gen1minDateTime=" + gen1minDateTime + ", gen1hrDateTime=" + gen1hrDateTime + ", gen15minDateTime="
				+ gen15minDateTime + ", location=" + location + "]";
	}

}
