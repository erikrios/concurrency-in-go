package com.erikriosetiawan;

public class Fahrenheit {

    protected static double fahrenheitToKelvin(double fahrenheit) {
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double kelvin;
        CONSTANT_VALUE_ONE = 459.67;
        CONSTANT_VALUE_TWO = 1.8;
        kelvin = (fahrenheit + CONSTANT_VALUE_ONE) * CONSTANT_VALUE_TWO;
        return kelvin;
    }

    protected static double fahrenheitToCelcius(double fahrenheit) {
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double celcius;
        CONSTANT_VALUE_ONE = 32;
        CONSTANT_VALUE_TWO = 1.8;
        celcius = (fahrenheit - CONSTANT_VALUE_ONE) * CONSTANT_VALUE_TWO;
        return celcius;
    }

    protected static double fahrenheitToReaumur(double fahrenheit) {
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double reaumur;
        CONSTANT_VALUE_ONE = 32;
        CONSTANT_VALUE_TWO = 0.44;
        reaumur = (fahrenheit - CONSTANT_VALUE_ONE) * CONSTANT_VALUE_TWO;
        return  reaumur;
    }
}
