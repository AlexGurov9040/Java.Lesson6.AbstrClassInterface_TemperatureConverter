package com.gurov.lesson6.task1;

public class Locale {

    String country;

    Locale(){

        this.country = "BS";
    }

    static Locale getDefault(){

        Locale locale = new Locale();
        return locale;
    }

    String getCountry(){

        return country;
    }
}
