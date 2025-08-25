package org.example;

public class App {
  public static void main(String[] args) {
        Converter converter = new Converter();

        int[] testOunces = {0, 1, 2, 16, 24, 32};

        System.out.println("Ounces to Pounds:");
        for (int oz : testOunces) {
            System.out.println(oz + " oz = " + converter.toPounds(oz));
        }

        System.out.println("\nOunces to Pounds and Ounces:");
        for (int oz : testOunces) {
            System.out.println(oz + " oz = " + converter.toPoundsAndOunces(oz));
        }
    }
}

