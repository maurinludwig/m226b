package com.mlns.terminal;

/**
 * defines platform
 */
public class Platform {

    private String platformNumber;
    private boolean forBusses;
    private boolean international;
    private boolean occupied;

    public Platform(String platformNumber, boolean forBusses, boolean international) {
        this.platformNumber = platformNumber;
        this.forBusses = forBusses;
        this.international = international;
        occupied = false;
    }

    public String getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    public boolean isForBusses() {
        return forBusses;
    }

    public void setForBusses(boolean forBusses) {
        this.forBusses = forBusses;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
