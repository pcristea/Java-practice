package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Petru Cristea on 10/6/2016.
 */
public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 10;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }

}