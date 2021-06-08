package com.gurov.lesson6.task1;

public class ConvertToFahrenheit extends Converter{

    @Override
    public double Convert(double temperature){

        return temperature * 1.8 + 32;
    }
}
