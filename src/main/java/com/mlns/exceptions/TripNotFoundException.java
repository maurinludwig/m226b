package com.mlns.exceptions;

/**
 * NoPlatfromAvailableException Class
 */
public class TripNotFoundException extends Exception {

    /**
     * Creates new Exception
     */
    public TripNotFoundException() {}

    /**
     * Constructor
     *
     * @param message: Error message
     */
    public TripNotFoundException(String message) {
        super(message);
    }
}
