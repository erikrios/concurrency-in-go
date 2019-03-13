package com.erikriosetiawan;

public class Kelvin {

    protected static double kelvinToCelcius(double kelvin) {
        final double CONSTANT_VALUE;
        double celcius;
        CONSTANT_VALUE = 273.15;
        celcius = kelvin - CONSTANT_VALUE;
        return celcius;
    }

    protected static double kelvinToFahrenheit(double kelvin) {
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double fahrenheit;
        CONSTANT_VALUE_ONE = 1.8;
        CONSTANT_VALUE_TWO = 459.67;
        fahrenheit = (kelvin * CONSTANT_VALUE_ONE) - CONSTANT_VALUE_TWO;
        return fahrenheit;
    }

    protected static double kelvinToReaumur(double kelvin){
        final double CONSTANT_VALUE_ONE;
        final double CONSTANT_VALUE_TWO;
        double reaumur;
        CONSTANT_VALUE_ONE = 273.15;
        CONSTANT_VALUE_TWO = 0.8;
        reaumur = (kelvin - CONSTANT_VALUE_ONE) * CONSTANT_VALUE_TWO;
        return reaumur;
    }

}
