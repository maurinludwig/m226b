package com.mlns.terminal;

import com.mlns.exceptions.NoPlatformAvailableException;

import java.util.ArrayList;
import java.util.List;

/**
 * BusTerminal Class
 */
public class BusTerminal {

    private String name;
    private List<Platform> platforms;

    /**
     * BusTerminal Constructor
     * @param name: Name of Busterminal
     */
    BusTerminal(String name) {
        this.name = name;
        platforms = new ArrayList<>();
    }

    /**
     * Gets platform of busterminal
     *
     * @param forBusses: is for busses
     * @param international: is international
     * @return Platform: All Platforms
     * @throws NoPlatformAvailableException: Exception
     */
    Platform getPlatform(boolean forBusses, boolean international) throws NoPlatformAvailableException {
        for(Platform p : platforms) {
            if(p.isForBusses() == forBusses && p.isInternational() == international) {
                return p;
            }
        }
        throw new NoPlatformAvailableException();
    }

    /**
     * Adds new platform
     *
     * @param platform: Platform
     */
    public void addPlatform(Platform platform) {
        platforms.add(platform);
    }

    /**
     * Gets name
     *
     * @return String: Name of Terminal
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name
     *
     * @param name: Name of Terminal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets platforms
     *
     * @return List: List of platforms
     */
    public List<Platform> getPlatforms() {
        return platforms;
    }

    /**
     * Sets platforms
     *
     * @param platforms: List of platforms
     */
    void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }
}
