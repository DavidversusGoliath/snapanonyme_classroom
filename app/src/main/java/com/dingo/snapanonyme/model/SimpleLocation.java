package com.zerofiltre.snapanonym.model;

public class SimpleLocation {
    private double latitude;
    private double longitude;

    public SimpleLocation() {
    }

    public SimpleLocation(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

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
}
