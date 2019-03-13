package com.erikriosetiawan;

public class Reaumur {

    protected static double reaumurToKelvin(double reaumur) {
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double kelvin;
        CONSTANT_VALUE_ONE = 0.8;
        CONSTANT_VALUE_TWO = 273.15;
        kelvin = (reaumur / CONSTANT_VALUE_ONE) + CONSTANT_VALUE_TWO;
        return kelvin;
    }

    protected static double reaumurToCelcius(double reaumur) {
        final double CONSTANT_VALUE;
        double celcius;
        CONSTANT_VALUE = 0.8;
        celcius = reaumur / CONSTANT_VALUE;
        return celcius;
    }

    protected static double reaumurToFahrenheit(double reaumur) {
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double fahrenheit;
        CONSTANT_VALUE_ONE = 2.25;
        CONSTANT_VALUE_TWO = 32;
        fahrenheit = (reaumur * CONSTANT_VALUE_ONE) + CONSTANT_VALUE_TWO;
        return fahrenheit;
    }
}
