package ru.ibs.shakirov;

import java.util.Scanner;

public class Final_task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Заархивированный вирус";
        String help = "Подсказка";
        String answer;
        int count = 0;
        boolean finish = false;
        boolean getHelp = false;

        System.out.println("Отдгадай загадку - Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        while (true) {
            answer = scanner.nextLine();

            if (answer.equals(help) && count == 0) {
                System.out.println("Вот тебе какая то подсказка - winrar avast");
                getHelp = true;
                answer = scanner.nextLine();
            }
            if (answer.equals(help) && !(count == 0)) {
                System.out.println("Подсказка уже недоступна");
            }

            if (answer.equals(correctAnswer)){
                System.out.println("Правильно!");
                finish = true;
                break;
            }
            if (count < 2 && finish == false && getHelp == false){
                System.out.println("Подумай еще!");
                count++;
            } else {
                break;
            }
        }
        scanner.close();

        if (finish == false) {
            System.out.println("Обидно, приходи в другой раз");
        }

    }
}