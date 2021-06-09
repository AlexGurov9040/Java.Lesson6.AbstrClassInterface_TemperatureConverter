package com.gurov.lesson6.task1;

public class FahrenheitLocale extends Locale{

    public double getConvert(double temperature){

        return temperature * 1.8 + 32;
    }
}
