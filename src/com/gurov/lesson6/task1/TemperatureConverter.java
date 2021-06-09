package com.gurov.lesson6.task1;

public class TemperatureConverter {

    public static void main(String[] args){

        TemperatureConverter app = new TemperatureConverter();
        app.BaseConverter();
    }

    public static void BaseConverter(){

        double temperature = 25.0;
        Converter celsius = new ConvertToCelsius();
        celsius.getInstance("",temperature);

        Converter fahrenheit = new ConvertToFahrenheit();
        fahrenheit.getInstance("BS",temperature);

        Converter kelvin = new ConvertToKelvin();
        kelvin.getInstance("",temperature);

        System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit\n",temperature,temperature);
    }
}
