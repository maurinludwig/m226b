package com.mlns.terminal;

import com.mlns.exceptions.NoPlatformAvailableException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Starter {

    private static Scanner scanner = new Scanner(System.in);
    private static BusTerminal busTerminal;
    private static List<Vehicle> vehicles;

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
        vehicles = Arrays.asList(
                new Bus(30, true, busTerminal.getPlatform(true, false), "Bern"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "München"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "Mels"),
                new Bus(50, true, busTerminal.getPlatform(true, true), "Rapperswil")
        );
        System.out.println("Willkommen!");
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

    private static String askForAction() {
        System.out.println();
        System.out.println("Sie haben folgende Möglichkeiten:");
        System.out.println("1 : Fahrplan anzeigen");
        System.out.println("2 : Reise Buchen");
        System.out.println("3 : Programm beenden");
        return scanner.nextLine();
    }

    private static void printScedule() {
        System.out.println("Folgende Verbindungen sind verfügbar:");
        for(Vehicle v : vehicles) {
            System.out.println("------------------------");
            System.out.println("Nach: " + v.getTo());
            System.out.println("Platform: " + v.getPlatform().getPlatformNumber());
            System.out.println("Kapazität: " + v.getCapacity());
            System.out.println("------------------------");
            System.out.println();
        }
    }

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
        System.out.println();
        System.out.println("Glückwunsch! Sie haben eine Reise nach " + vehicles.get(destination).getTo() + " gebucht.");
        System.out.println("Die Reise beginnt auf Platform " + vehicles.get(destination).getPlatform().getPlatformNumber() + "");
    }

    private static String askForDestination() {
        System.out.println();
        System.out.println("Wohin wollen Sie fahren? Bitte geben Sie die entsprechende Zahl ein.");
        for(int i = 0; i < vehicles.size(); i++) {
            System.out.println(i + 1 + ": " + vehicles.get(i).getTo());
        }
        return scanner.nextLine();
    }
}
