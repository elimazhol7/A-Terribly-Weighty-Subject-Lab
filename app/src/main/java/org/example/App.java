package org.example;

public class App {
    public static void main(String[] args) {
        Converter converter = new Converter();

        // Simulated user input
        int ounces = 62; //change this value to test different inputs

        // welcome prompt
        System.out.println("Welcome to the Ounce Conversion Program!\n");

        // confirming input
        System.out.println("How many ounces do you have? " + ounces);
        System.out.println("Thank you! Converting ounces to pounds.\n");

        // printing converted values
        System.out.println(ounces + " oz is equivalent to " 
                           + converter.toPoundsAndOunces(ounces) + ".");
        System.out.println(ounces + " oz is equivalent to " 
                           + converter.toPounds(ounces) + ".\n");

        // exiting message
        System.out.println("Thank you for using the OCP!");
    }
}


