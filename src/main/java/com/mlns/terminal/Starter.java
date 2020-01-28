package com.mlns.terminal;

import com.mlns.exceptions.NoPlatformAvailableException;
import com.mlns.exceptions.TripNotFoundException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Title: Busterminal M226b
 * Author: Nicolas Schulle & Maurin Ludwig
 * Version: 1.1
 * last modified: 27.01.2020
 *
 * Starter Class
 */
public class Starter {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Vehicle> vehicles;

    /**
     * Main Class
     * Defines actions for input
     *
     * @param args: Arguments
     * @throws NoPlatformAvailableException: No platform is available
     */
    public static void main(String[] args) throws NoPlatformAvailableException, TripNotFoundException {
        setUp();
        boolean terminted = false;
        while (!terminted) {
            int action = getAction();
            if (action == 1) {
                printScedule();
            } else if (action == 2) {
                try {
                    bookTrip();
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new TripNotFoundException("Destination not found");
                }
            } else if (action == 3) {
                terminted = true;
            }
        }
    }

    /**
     * Creates platform array with busses in it. Defines if vehicle is a bus and if bus is international (not implemented).
     *
     * @throws NoPlatformAvailableException: No platform is available
     */
    private static void setUp() throws NoPlatformAvailableException {
        BusTerminal busTerminal = new BusTerminal("Zürich");
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

        vehicles = Arrays.asList(
                new Bus(30, true, busTerminal.getPlatform(true, false), "Bern"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "München"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "Mels"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "Rapperswil")
        );
        System.out.println("Welcome!");
    }

    /**
     * Gets action from string
     *
     * @return int: Action integer
     */
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
     * Asks for action. Prints action menu.
     *
     * @return String: Chosen action as a string
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
     * Prints available routes.
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
     * Asks input for destination.
     *
     * @return String: Chosen destination as a string
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
     * Checks if destination input is given. Matches input to route. Gives feedback as output.
     */
    private static void bookTrip() throws TripNotFoundException {
        String destinationAsString = askForDestination();
        int destination = 0;
        boolean hasDestination = false;
        while(!hasDestination) {
            try {
                destination = Integer.parseInt(destinationAsString) - 1;
                hasDestination = true;
            } catch (NumberFormatException e) {
                destinationAsString = askForDestination();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new TripNotFoundException("Destination not found");
            }
        }

        System.out.println();
        System.out.println("Congratulations! You booked a trip to " + vehicles.get(destination).getTo() + "");
        System.out.println("The trip starts at platfom " + vehicles.get(destination).getPlatform().getPlatformNumber() + "");
    }


}
