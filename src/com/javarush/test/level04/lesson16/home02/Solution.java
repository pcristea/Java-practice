package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Вводим три числа
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        //методом max ищем самое больше среди a b
        int maxAB = max(a,b);
        //этим же методом ищем самое большое
        //среди первой пары и c
        int max = max(maxAB,c);

        //аналогичный выбор делаем минимального
        //значения с помощью метода min
        int minAB = min(a,b);
        int min = min(minAB, c);

        //если число меньше максимума и больше минимума - печатаем
        if ((a>min)&&(a<max)) System.out.println(a);
        if ((b>min)&&(b<max)) System.out.println(b);
        if ((c>min)&&(c<max)) System.out.println(c);
    }

    private static int min(int a, int b)
    {
        //метод поиска минимального
        if (a < b) return a;
        else return b;
    }

    private static int max(int a, int b)
    {   //метод поиска максимального
        if (a > b) return a;
        else return b;
    }
}