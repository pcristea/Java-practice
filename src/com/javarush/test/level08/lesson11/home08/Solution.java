package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] array = new Integer[20]; //при сортировке массива при помощи метода sort() из класса Arrays нужно использовать тип Integer[] вместо примитивного типа int[].
        for (int i = 0; i < array.length; i++)
        {
            //array[i] = (int)(Math.random() * 100);
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(Integer[] array)
    {
        Arrays.sort(array, Collections.reverseOrder()); //Сортировка массива при помощи метода sort() из класса Arrays
    }
}