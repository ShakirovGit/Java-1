package ru.ibs.shakirov;

import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        int[] arrayMy = new int[10];
        Random random = new Random();
        int minNum = 0;
        int maxNum = 0;

        for (int i = 0; i < arrayMy.length; i++) {
            arrayMy[i] = random.nextInt(40) - 20;
        }

        for (int num : arrayMy) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
        System.out.println(maxNum + " " + minNum);
        System.out.println(Math.max(Math.abs(minNum), Math.abs(maxNum)));

    }
}
