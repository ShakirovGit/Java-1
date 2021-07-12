package ru.ibs.shakirov;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        /*
        Напишите программу,
        где пользователь вводит данные с клавиатуры в матрицу,
        а после этого произведите вывод первой строки матрицы на экран,
        где каждый элемент умножается на 3.
        Размерность матрицы задается пользователем.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int lineSizeMatrix = scanner.nextInt();
        System.out.println("Введите кол-во столбцов");
        int columnSizeMatrix = scanner.nextInt();

        int[][] matrix = new int[lineSizeMatrix][columnSizeMatrix];

        for (int i = 0; i < lineSizeMatrix; i++) {
            System.out.println("Массив N " + i);
            for (int j = 0; j < columnSizeMatrix; j++) {
                System.out.println("ВВедите значение элемента " + j + " из " + columnSizeMatrix + " элементов");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < columnSizeMatrix; i++) {
            System.out.println(matrix[0][i] * 3);
        }

    }
}
