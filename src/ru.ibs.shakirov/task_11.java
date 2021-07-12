package ru.ibs.shakirov;

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.next();
        int intNum = scanner.nextInt();
        double doubleNum;

        if (Integer.parseInt(strNum) > intNum) {
            System.out.println(strNum);
            doubleNum = intNum;
        } else {
            System.out.println(intNum);
            doubleNum = Double.parseDouble(strNum);
        }
        System.out.println(doubleNum);
    }
}
