package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Petru Cristea on 10/6/2016.
 */
abstract class Hen
{
    abstract int getCountOfEggsPerMonth();
    String getDescription() {
        return "Я курица.";
    }
}
