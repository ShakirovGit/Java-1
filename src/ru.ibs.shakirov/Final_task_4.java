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

        do {
            answer = scanner.nextLine();

            if (answer.equals(help) && count == 0) {
                System.out.println("Вот тебе какая то подсказка - winrar avast");
                getHelp = true;
                answer = scanner.nextLine();
            }

            if (answer.equals(help) && count != 0) {
                System.out.println("Подсказка уже недоступна");
                count--;
            }

            if (answer.equals(correctAnswer)){
                System.out.println("Правильно!");
                break;
            }

            if (count < 2 && !finish && !getHelp){
                System.out.println("Подумай еще!");
            }

            if (count == 2 || getHelp){
                System.out.println("Обидно, приходи в другой раз");
                finish = true;
            }
            count++;

        } while (!finish);

        scanner.close();
    }
}
