package com.mlns.terminal;

/**
 * Platform Class
 */
public class Platform {

    private String platformNumber;
    private boolean forBusses;
    private boolean international;
    private boolean occupied;

    /**
     * Platform constructor
     *
     * @param platformNumber: Number of platform
     * @param forBusses: Is platform for busses
     * @param international: Is platform international
     */
    Platform(String platformNumber, boolean forBusses, boolean international) {
        this.platformNumber = platformNumber;
        this.forBusses = forBusses;
        this.international = international;
        occupied = false;
    }

    /**
     * Gets platform number
     *
     * @return String: Number of platform
     */
    String getPlatformNumber() {
        return platformNumber;
    }

    /**
     * Sets platform number
     *
     * @param platformNumber: Number of platform
     */
    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    /**
     * Gets bool isForBusses
     *
     * @return boolean: Is for busses
     */
    boolean isForBusses() {
        return forBusses;
    }

    /**
     * Sets bool isForBusses
     *
     * @param forBusses: Is for busses
     */
    public void setForBusses(boolean forBusses) {
        this.forBusses = forBusses;
    }

    /**
     * Gets bool isInternational
     *
     * @return boolean: is International
     */
    boolean isInternational() {
        return international;
    }

    /**
     * Sets bool isInternational
     *
     * @param international: is International
     */
    public void setInternational(boolean international) {
        this.international = international;
    }

    /**
     * Bool is occupied
     *
     * @return boolean: is occupied
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * Sets is occupied
     *
     * @param occupied: is occupied
     */
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
