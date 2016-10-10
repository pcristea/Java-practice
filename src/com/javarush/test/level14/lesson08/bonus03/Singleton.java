package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Petru Cristea on 10/10/2016.
 */
public class Singleton
{
    static Singleton INSTANCE = null;

    private Singleton()
    {
    }

    static Singleton getInstance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
