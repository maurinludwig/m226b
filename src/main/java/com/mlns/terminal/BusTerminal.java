package com.mlns.terminal;

import com.mlns.exceptions.NoPlatformAvailableException;

import java.util.ArrayList;
import java.util.List;

/**
 * defines class BusTerminal
 */
public class BusTerminal {

    private String name;
    private List<Platform> platforms;

    public BusTerminal(String name) {
        this.name = name;
        platforms = new ArrayList<>();
    }

    public Platform getPlatform(boolean forBusses, boolean international) throws NoPlatformAvailableException {
        for(Platform p : platforms) {
            if(p.isForBusses() == forBusses && p.isInternational() == international) {
                return p;
            }
        }
        throw new NoPlatformAvailableException();
    }

    public void addPlatform(Platform platform) {
        platforms.add(platform);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }
}
