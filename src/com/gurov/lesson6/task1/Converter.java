package com.gurov.lesson6.task1;

import java.util.Arrays;

public abstract class Converter {

    abstract double Convert(double temperature);

    public static Converter getInstance(){
        Locale locale = Locale.getDefault();
        String[] fahrenheitCountries = {"BS", "US", "BZ", "KY", "PW"};

        if(Arrays.asList(fahrenheitCountries).contains(locale.getCountry())){
            return new ConvertToFahrenheit();
        } else {
            return new ConvertToCelsius();
        }
    }
}
