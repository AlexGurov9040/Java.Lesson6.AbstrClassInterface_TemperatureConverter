package com.gurov.lesson6.task1;

public class ConvertToKelvin extends Converter{

    @Override
    public Locale getDefault(String country){

        Locale locale = new KelvinLocale();
        return locale;
    }

}
