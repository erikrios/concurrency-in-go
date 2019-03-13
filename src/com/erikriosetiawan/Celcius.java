package com.erikriosetiawan;

public class Celcius {

    protected static double celciusToKelvin(double celcius) {
        final double CONSTANT_VALUE;
        double kelvin;
        CONSTANT_VALUE = 273.15;
        kelvin = celcius + CONSTANT_VALUE;
        return kelvin;
    }

    protected static double celciusToFahrenheit(double celcius) {
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double fahrenheit;
        CONSTANT_VALUE_ONE = 1.8;
        CONSTANT_VALUE_TWO = 32;
        fahrenheit = (celcius * CONSTANT_VALUE_ONE) + CONSTANT_VALUE_TWO;
        return fahrenheit;
    }

    protected static double celciusToReaumur(double celcius) {
        final double CONSTANT_VALUE;
        double reaumur;
        CONSTANT_VALUE = 0.8;
        reaumur = celcius * CONSTANT_VALUE;
        return reaumur;
    }
}
