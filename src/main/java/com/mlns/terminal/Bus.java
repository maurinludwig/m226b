package com.mlns.terminal;

/**
 * Bus Class
 */
class Bus extends Vehicle {

    /**
     * Bus Constructor
     *
     * @param capacity: Capacity of bus
     * @param firstClass: is Bus first class
     * @param platform: Platform of bus
     * @param to: Destination of bus
     */
    Bus(int capacity, boolean firstClass, Platform platform, String to) {
        super(capacity, firstClass, platform, to);
    }
}
