package org.example;

public class Converter {
   //converting ounces to pounds as a formatted string
    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        String poundLabel = (pounds == 1.0) ? "lb" : "lbs";
        return String.format("%.4f %s", pounds, poundLabel);
    }

   //converting ounces to pounds and remaining ounces as a formatted string
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        String poundLabel = (pounds == 1) ? "lb" : "lbs";
        return String.format("%d %s %d oz", pounds, poundLabel, remainingOunces);
    }
}


