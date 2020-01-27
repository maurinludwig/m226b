package com.mlns.terminal;

/**
 * Vehicle Class
 */
public abstract class Vehicle {

    private int capacity;
    private boolean firstClass;
    private Platform platform;
    private String to;

    /**
     * Vehicle constructor
     * @param capacity: Capacity of the vehicle
     * @param firstClass: Is vehicle first class
     * @param platform: Where this vehicle is
     * @param to: Where this vehicle goes
     */
    Vehicle(int capacity, boolean firstClass, Platform platform, String to) {
        this.capacity = capacity;
        this.firstClass = firstClass;
        this.platform = platform;
        this.to = to;
    }

    /**
     * Gets capacity
     *
     * @return int: Capacity of vehicle
     */
    int getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity
     *
     * @param capacity: Capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets bool isFirstClass
     *
     * @return boolen: Is vehicle first class
     */
    public boolean isFirstClass() {
        return firstClass;
    }

    /**
     * Sets bool isFirstClass
     *
     * @param firstClass: Bool
     */
    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }

    /**
     * Gets platform
     *
     * @return Platform: Platform of vehicle
     */
    Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform
     *
     * @param platform: Sets platform of vehicle
     */
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     * Gets destination
     *
     * @return String: Destination
     */
    String getTo() {
        return to;
    }

    /**
     * Sets destination
     *
     * @param to: Destination
     */
    public void setTo(String to) {
        this.to = to;
    }
}
