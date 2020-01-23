package com.kek.terminal;
import java.util.Scanner;


public class Platform {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Willkommen am Bus Terminal");
    	System.out.println("Willkommen am Bus Terminal");
    	System.out.print("Enter an integer: ");
    	String number = input.next();
    	System.out.println("You entered " + number);
    	input.close();
    }
}