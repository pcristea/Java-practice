package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Petru Cristea on 10/10/2016.
 */
public class Hrivna extends Money
{
    public Hrivna( double amount )
    {
        super( amount );
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}