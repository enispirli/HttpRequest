package com.elifnur.httprequest.model.rows;

public class Location {
	double latitude;
	double longitude;
	double elevation;

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getElevation() {
		return elevation;
	}

	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	@Override
	public String toString() {
		return getLatitude() + "," + getLongitude() + "," + getElevation();
	}

}
