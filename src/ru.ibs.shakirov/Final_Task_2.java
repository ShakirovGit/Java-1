package ru.ibs.shakirov;

import java.util.Scanner;

public class Final_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String firstNumber = str.substring(0, 1);
        String plusOrMinus = str.substring(1, 2);
        String secondNumber = str.substring(2, 3);
        String thirdNumber = str.substring(4, 5);

        if (secondNumber.equals("x")) {
            int x = Integer.parseInt(firstNumber) - Integer.parseInt(thirdNumber);
            if (plusOrMinus.equals("-")) {
                System.out.println(x);
            } else {
                System.out.println(Math.abs(x));
            }
        }

        if (firstNumber.equals("x")) {
            if (plusOrMinus.equals("+")) {
                System.out.println(Integer.parseInt(thirdNumber) - Integer.parseInt(secondNumber));
            } else {
                System.out.println(Integer.parseInt(secondNumber) + Integer.parseInt(thirdNumber));
            }
        }

        if (thirdNumber.equals("x")) {
            if (plusOrMinus.equals("+")) {
                System.out.println(Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber));
            } else {
                System.out.println(Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber));
            }
        }
    }
}
