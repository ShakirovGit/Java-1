package ru.ibs.shakirov;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] arrayStr = str.split(" ");
        int count = 0;
        for (String word : arrayStr) {

            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
