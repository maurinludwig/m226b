package com.mlns.terminal;

/**
 * defines class Vehicle
 */
public abstract class Vehicle {

    private int capacity;
    private boolean firstClass;
    private Platform platform;
    private String to;

    public Vehicle(int capacity, boolean firstClass, Platform platform, String to) {
        this.capacity = capacity;
        this.firstClass = firstClass;
        this.platform = platform;
        this.to = to;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFirstClass() {
        return firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
