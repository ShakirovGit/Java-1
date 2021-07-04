package ru.ibs.shakirov;

import java.util.Scanner;

public class Shakirov {
    public static void main(String[] args) {
        /*
        //Задача 1
        System.out.print("Hello World!");

        //Задача 2
        double d = 3.17543545;
        byte b = 127;

        //Задача 3
        int[] arrNum = {1, 2, 3, 4, 5};

        int firstNum = arrNum[0];
        int lastNum = arrNum[arrNum.length - 1];
        arrNum[0] = lastNum;
        arrNum[arrNum.length -1] = firstNum;

        System.out.println(arrNum[0] + arrNum[arrNum.length / 2]);
        */
        //Задача 4
        /*
        //пункт 1
        Scanner scannerForAverage = new Scanner(System.in);
        double numX = scannerForAverage.nextDouble();
        double numY = scannerForAverage.nextDouble();
        double numZ = scannerForAverage.nextDouble();
        scannerForAverage.close();
        //пункт 2
        double average = (numX + numY + numZ) / 3;
        System.out.println(average);
        //пункт 3
        double shareAverage = Math.floor(average / 2);
        System.out.println(shareAverage);
        //пункт 4
        if (shareAverage > 3) {
            System.out.println("Программа выполнена корректно");
        }
        */
        //Задача 5
        /*
        //пункт 1
        Scanner scannerForCals = new Scanner(System.in);
        int numFirst = scannerForCals.nextInt();
        int numSecond = scannerForCals.nextInt();
        String symbol = scannerForCals.next();
        //пункт 2
        switch (symbol) {
            case "+":
                System.out.println(numFirst + numSecond);
                break;
            case "-":
                System.out.println(numFirst - numSecond);
                break;
            case "*":
                System.out.println(numFirst * numSecond);
                break;
            case "/":
                if (numFirst == 0 || numSecond == 0) {
                    System.out.println("На ноль делить не буду");
                } else {
                    System.out.println(numFirst / numSecond);
                }
                break;
            default:
                System.out.println("Я так не умею =(");
        }
        */
        //Задача 6
        Scanner scannerConv = new Scanner(System.in);

        int physicalQuantity, unit;
        double number;

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        physicalQuantity = scannerConv.nextInt();

        if (physicalQuantity == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - стон, 3 - фунт, 4 - унция");
            unit = scannerConv.nextInt();

            if (unit >= 1 && unit <= 4) {
                System.out.println("Введите число");
                number = scannerConv.nextInt();

                switch (unit) {
                    case 1:
                        System.out.println("Килограмм: " + number);
                        System.out.println("Стон: " + number / 6.35);
                        System.out.println("Фунт: " + number * 2.205);
                        System.out.println("Унция: " + number * 35.274);
                        break;
                    case 2:
                        System.out.println("Стон: " + number);
                        System.out.println("Килограмм: " + number * 6.35);
                        System.out.println("Фунт: " + number * 14);
                        System.out.println("Унция: " + number * 224);
                        break;
                    case 3:
                        System.out.println("Фунт: " + number);
                        System.out.println("Килограмм: " + number / 2.205);
                        System.out.println("Стон: " + number / 14);
                        System.out.println("Унция: " + number * 16);
                        break;
                    case 4:
                        System.out.println("Унция: " + number);
                        System.out.println("Килограмм: " + number / 35.274);
                        System.out.println("Фунт: " + number / 16);
                        System.out.println("Стон: " + number / 224);
                        break;
                }
            } else {
                System.out.println("Нужно выбрать от 1 до 4");
            }
        } else if (physicalQuantity == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            unit = scannerConv.nextInt();

            if (unit >= 1 && unit <= 4) {
                System.out.println("Введите число");
                number = scannerConv.nextInt();

                switch (unit) {
                    case 1:
                        System.out.println("Метры: " + number);
                        System.out.println("Мили: " + number / 1609);
                        System.out.println("Ярды: " + number * 1.094);
                        System.out.println("Футы: " + number * 3.281);
                        break;
                    case 2:
                        System.out.println("Мили: " + number);
                        System.out.println("Метры: " + number * 1609);
                        System.out.println("Ярды: " + number * 1760);
                        System.out.println("Футы: " + number * 5280);
                        break;
                    case 3:
                        System.out.println("Ярды: " + number);
                        System.out.println("Метры: " + number / 1.094);
                        System.out.println("Мили: " + number / 1760);
                        System.out.println("Футы: " + number * 3);
                        break;
                    case 4:
                        System.out.println("Футы: " + number);
                        System.out.println("Метры: " + number / 3.281);
                        System.out.println("Мили: " + number / 5280);
                        System.out.println("Ярды: " + number / 3);
                        break;
                }
            } else {
                System.out.println("Нужно выбрать от 1 до 4");
            }
        } else {
            System.out.println("Нужно выбрать 1 или 2");
        }
    }
}
