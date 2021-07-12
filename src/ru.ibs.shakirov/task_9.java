package ru.ibs.shakirov;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        /*
        Напишите программу:

        Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

        Посчитайте среднее арифметическое элементов массива.

        После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        */
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        double[] myArray = new double[sizeArray];
        double result = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextDouble();
            result += myArray[i];
        }
        result = result / sizeArray;

        for (double num : myArray) {
            System.out.println(num * result);
        }


    }
}
