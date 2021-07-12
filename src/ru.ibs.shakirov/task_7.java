package ru.ibs.shakirov;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        /*
        Напишите программу:

            Пользователь вводит размер массива и данные с клавиатуры в массив

            Сравнить элементы массива с заранее заданными константами x, y, z.

            Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
         */

        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();

        final int x = 10;
        final int y = 15;
        final int z = 20;

        int[] myArray = new int[sizeArray];

        for (int i = 0; i < myArray.length; i++) {
            int numInput = scanner.nextInt();
            myArray[i] = numInput;
        }
        scanner.close();
        for (int num : myArray) {
            if (num == x || num == y || num == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}
