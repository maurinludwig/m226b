package com.mlns.terminal;

import java.util.Date;

/**
 * defines class Travel
 */
public class Travel {

    private String destination;
    private Date departureTime;
    private Date arrivalTime;
    private boolean international;
    private Vehicle vehicle;

    public Travel(String destination, Date departureTime, Date arrivalTime, boolean international, Vehicle vehicle) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.international = international;
        this.vehicle = vehicle;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
