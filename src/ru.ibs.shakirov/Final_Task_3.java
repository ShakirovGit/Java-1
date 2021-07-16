package ru.ibs.shakirov;

import java.util.Scanner;

public class Final_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во строк");
        int countLine = scanner.nextInt();
        String[] myArray = new String[countLine];
        int maxCountIndex = 0;
        int winnerIndex = 0;

        System.out.println("Введите " + countLine + " строк");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.next();
        }

        scanner.close();

        for (int i = 0; i < myArray.length; i++) {
            int count = (int) myArray[i].chars().distinct().count();
            if (count > maxCountIndex) {
                maxCountIndex = count;
                winnerIndex = i;
            }
        }
        System.out.println(myArray[winnerIndex]);
    }
}
