package com.mlns.terminal;

import com.mlns.exceptions.NoPlatformAvailableException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * defines starter class
 */
public class Starter {

    private static Scanner scanner = new Scanner(System.in);
    private static BusTerminal busTerminal;
    private static List<Vehicle> vehicles;

    /**
     * defines actions for input
     * @param args
     * @throws NoPlatformAvailableException
     */
    public static void main(String[] args) throws NoPlatformAvailableException {
        setUp();
        boolean terminted = false;
        while (!terminted) {
            int action = getAction();
            if (action == 1) {
                printScedule();
            } else if (action == 2) {
                bookTrip();
            } else if (action == 3) {
                terminted = true;
            }
        }
    }

    /**
     * creates array with platforms. defines if platform is for international routes.
     *defines if platform is for busses or not.
     * @throws NoPlatformAvailableException
     */
    private static void setUp() throws NoPlatformAvailableException {
        busTerminal = new BusTerminal("Zürich");
        busTerminal.setPlatforms(Arrays.asList(
                new Platform("A", true, true),
                new Platform("B", true, true),
                new Platform("C", true, false),
                new Platform("D", true, false),
                new Platform("1", false, true),
                new Platform("2", false, true),
                new Platform("3", false, false),
                new Platform("4", false, false)
        ));
        /**
         * creates routes with routename, bus and platform
         */
        vehicles = Arrays.asList(
                new Bus(30, true, busTerminal.getPlatform(true, false), "Bern"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "München"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "Mels"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "Rapperswil")
        );
        System.out.println("Welcome!");
    }

    private static int getAction() {
        String actionAsString = askForAction();
        int action = 0;
        boolean hasAction = false;
        while(!hasAction) {
            try {
                action = Integer.parseInt(actionAsString);
                hasAction = true;
            } catch (NumberFormatException e) {
                actionAsString = askForAction();
            }
        }
        return action;
    }

    /**
     * prints menu
     * @return
     */
    private static String askForAction() {
        System.out.println();
        System.out.println("The following options are available to you:");
        System.out.println("1 : Show timetbale");
        System.out.println("2 : Book a trip");
        System.out.println("3 : Terminate the program");
        return scanner.nextLine();
    }

    /**
     * prints available routes
     */
    private static void printScedule() {
        System.out.println("The following connections are available to you:");
        for(Vehicle v : vehicles) {
            System.out.println("------------------------");
            System.out.println("To: " + v.getTo());
            System.out.println("Platform: " + v.getPlatform().getPlatformNumber());
            System.out.println("Capacity: " + v.getCapacity());
            System.out.println("------------------------");
            System.out.println();
        }
    }
    /**
     * asks input for destination
     * @return
     */
    private static String askForDestination() {
        System.out.println();
        System.out.println("Where do you want to go. Please enter the number of your destination");
        for(int i = 0; i < vehicles.size(); i++) {
            System.out.println(i + 1 + ": " + vehicles.get(i).getTo());
        }
        return scanner.nextLine();
    }
    /**
     * checks if destination input is given.
     * matches input to route
     */
    private static void bookTrip() {
        String destinationAsString = askForDestination();
        int destination = 0;
        boolean hasDestination = false;
        while(!hasDestination) {
            try {
                destination = Integer.parseInt(destinationAsString) - 1;
                hasDestination = true;
            } catch (NumberFormatException e) {
                destinationAsString = askForDestination();
            }
        }
        /**
         * prints destination and platform for chosen route.
         */
        System.out.println();
        System.out.println("Congratulations! You booked a trip to " + vehicles.get(destination).getTo() + "");
        System.out.println("The trip starts at platfom " + vehicles.get(destination).getPlatform().getPlatformNumber() + "");
    }


}
