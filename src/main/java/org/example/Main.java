package org.example;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;

import static org.example.DublicateComparison.findDuplicates;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 2, 2, 5, 6, 7};
        int trueCount = 1;
        ArrayList dublicateNumber = new ArrayList();
        boolean Result;
        for (int a = 0; a < list.length; a++) {
            for (int b = a + 1; b < list.length; b++) {
                if (list[a] == list[b]) {
                    dublicateNumber.add(list[a]);
                    Result = true;
                    trueCount++;
                } else Result = false;
            }
        }
        if (dublicateNumber.size() == list.length) {
            System.out.println("Дубликатов нет");
        } else System.out.println("Число " + dublicateNumber.get(0) + " повторяется" + dublicateNumber.size() + " раз");


        // TODO 1 задача.
        /*int[] list = new int[]{2, 9, 41, 10};
        int a = -1;
        int b = -1;
        int Number = 11;
        ArrayList<Integer> array = new ArrayList();
        System.out.println(list.length);
        for (Integer i : list) {
            a++;
            for (Integer x : list) {
                b++;
                int summary = x + i;
                if (summary == Number) {
                    array.add(a);
                    array.add(b);
                    // Нашел способ выбрать индексы через binarySearch, но это я гуглил, поэтому нечестно.
                    System.out.printf("Первый индекс " + array.get(0) + "\n" + "Второй индекс " + array.get(1));
                    System.exit(0);
                }
            }
        }*/
    }
}
