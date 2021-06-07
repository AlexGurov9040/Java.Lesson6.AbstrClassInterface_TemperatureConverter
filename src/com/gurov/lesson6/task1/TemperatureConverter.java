package com.gurov.lesson6.task1;

public class TemperatureConverter {

    public static void main(String[] args){

        TemperatureConverter app = new TemperatureConverter();
        app.BaseConverter();
    }

    public static void BaseConverter(){

        double temperature = 25.0;
        Converter celsius = new ConvertToCelsius();
        Converter kelvin = new ConvertToKelvin();
        Converter fahrenheit = new ConvertToFahrenheit();
        System.out.printf("%.2f degrees Celsius is %.2f degrees Kelvin\n",celsius.Convert(temperature),kelvin.Convert(temperature));
        System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit\n",celsius.Convert(temperature),fahrenheit.Convert(temperature));

    }
}
