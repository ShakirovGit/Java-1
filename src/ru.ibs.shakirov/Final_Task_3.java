package ru.ibs.shakirov;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Final_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите кол-во строк");
        int countLine = scanner.nextInt();
        String[] myArray = new String[countLine];
        int maxCountindex = 0;
        int winnerIndex = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.next();
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].matches("[a-zA-Z]+")){
                int count = (int) myArray[i].chars().count();
                if (count > maxCountindex) {
                    maxCountindex = count;
                    winnerIndex = i;
                }
            }
        }
        System.out.println(myArray[winnerIndex]);



    }
}
