package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            strings.add(scanner.next());
        int maxLen = strings.get(0).length();
        for (int i = 1; i < 5; i++)
            if (maxLen < strings.get(i).length()) {
                maxLen = strings.get(i).length();
            }

        for (int i = 0; i < 5; i++)
            if (strings.get(i).length() == maxLen)
                System.out.println(strings.get(i));


    }
}
