package ru.ibs.shakirov;

import java.util.Scanner;

public class Final_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите курс валюты");
        double curs = scanner.nextDouble();

        System.out.println("ВВедите кол-во рублей");
        double sum = scanner.nextDouble();

        scanner.close();

        System.out.println("Итого: " + String.format("%.2f", sum/curs) + " долларов");
    }
}
