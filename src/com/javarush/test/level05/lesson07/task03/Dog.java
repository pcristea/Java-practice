package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{

    private String name;
    private String color;
    private int toll;



    public void initialize( String name )
    {
        this.name = name;

    }

    public void initialize( String name, int toll )
    {
        this.name = name;
        this.toll = toll;
    }

    public void initialize( String name, int toll, String color )
    {
        this.name = name;
        this.color = color;
        this.toll = toll;

    }
}
