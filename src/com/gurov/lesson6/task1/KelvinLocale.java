package com.gurov.lesson6.task1;

public class KelvinLocale extends Locale{

    public double getConvert(double temperature){

        return temperature + 273.15;
    }
}
