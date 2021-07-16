package ru.ibs.shakirov;

import java.util.Scanner;

public class Final_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String firstNumber = str.substring(0,1);
        String plusOrMinus = str.substring(1,2);
        String secondNumber = str.substring(2,3);
        String threeNumber= str.substring(4,5);

       if (secondNumber.equals("x") && !(firstNumber.equals("0")) && !(threeNumber.equals("0"))){
           int x = Integer.parseInt(threeNumber) - Integer.parseInt(firstNumber);
           if (plusOrMinus.equals("-")) {
               System.out.println((x) / -1);
           } else {
               System.out.println(x);
           }
       } else if (firstNumber.equals("0") || threeNumber.equals("0")){
           if (firstNumber.equals("0")) {
               System.out.println(threeNumber);
           } else {
               System.out.println(firstNumber);
           }
       }

       if (firstNumber.equals("x") && !(secondNumber.equals("0")) && !(threeNumber.equals("0"))){
           int x = Integer.parseInt(threeNumber) - Integer.parseInt(secondNumber);
           if (plusOrMinus.equals("+")) {
               System.out.println(x);
           } else {
               System.out.println(Integer.parseInt(secondNumber) + Integer.parseInt(threeNumber));
           }
       } else if (secondNumber.equals("0") || threeNumber.equals("0")){
           if (secondNumber.equals("0")) {
               System.out.println(threeNumber);
           } else {
               System.out.println(secondNumber);
           }
       }

       if (threeNumber.equals("x") && !(firstNumber.equals("0")) && !(secondNumber.equals("0"))){
           int x = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
           if (plusOrMinus.equals("+")) {
               System.out.println(x);
           } else {
               System.out.println(Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber));
           }
       } else if (secondNumber.equals("0") || threeNumber.equals("0")){
           if (secondNumber.equals("0")) {
               System.out.println(threeNumber);
           } else {
               System.out.println(secondNumber);
           }
       }
    }
}
