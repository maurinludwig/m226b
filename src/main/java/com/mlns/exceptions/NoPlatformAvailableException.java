package com.mlns.exceptions;

/**
 * NoPlatfromAvailableException Class
 */
public class NoPlatformAvailableException extends Exception {

    /**
     * Creates new Exception
     */
    public NoPlatformAvailableException() {}

    /**
     * Constructor
     *
     * @param message: Error message
     */
    public NoPlatformAvailableException(String message) {
        super(message);
    }
}
