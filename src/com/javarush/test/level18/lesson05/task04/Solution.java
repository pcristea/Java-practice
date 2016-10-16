package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (fileInputStream.available() > 0)
        {
            arrayList.add(fileInputStream.read());
        }

        Collections.reverse(arrayList);

        for (Integer i :
                arrayList)
        {
            fileOutputStream.write(i);
        }
        fileInputStream.close();
        fileOutputStream.close();
        scanner.close();
    }
}
