package com.gurov.lesson6.task1;

import java.util.Arrays;

public abstract class Converter {

    public double getConvert(String country,double temperature){

        Locale locale = getDefault(country);
        temperature = locale.getConvert(temperature);
        return temperature;
    }

    public Locale getDefault(String country){

        Locale locale;
        String[] fahrenheitCountries = {"BS", "US", "BZ", "KY", "PW"};
        if (Arrays.asList(fahrenheitCountries).contains(country))
            locale = new FahrenheitLocale();
        else
            locale = new CelsiusLocale();
        return locale;
    }
}
