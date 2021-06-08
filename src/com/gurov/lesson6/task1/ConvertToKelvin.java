package com.gurov.lesson6.task1;

public class ConvertToKelvin extends Converter{

    @Override
    public double Convert(double temperature){

        return temperature + 273.15;
    }

}
