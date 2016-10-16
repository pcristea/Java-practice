package com.javarush.test.level18.lesson03.task01;

import java.io.FileInputStream;
import java.util.Scanner;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int max = fileInputStream.read();
        while (fileInputStream.available() > 0)
        {
            int r = fileInputStream.read();
            if (r > max)
                max = r;
        }
        System.out.println(max);
        fileInputStream.close();
        scanner.close();
    }
}
