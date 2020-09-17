package com.step.converter;

public class TempConverter {
    public void convertToFahr(double celsius) {
        System.out.println(celsius + "°C → " + (((celsius * ((double)9 / 5)) + 32) + " °F"));
    }

    public void convertToCelsius(double fahr) {
        System.out.println(fahr + "°F → " + ((fahr - 32) * ((double)5 / 9)) + " °C");

    }
}
