package ru.ibs.shakirov;

public class task_12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }
        str = str.replace("a","o");
        System.out.println(str.substring(7,11));
    }
}
