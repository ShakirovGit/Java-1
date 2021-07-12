package ru.ibs.shakirov;

import java.util.Scanner;

public class task_8 {
    /*
    Напишите программу, где пользователь вводит любое целое число n.
    А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numInput; i++) {
            if (!(i % 2 == 0)) {
                sum += i;
            }
        }
    }
}
