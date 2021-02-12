package com.learn;

import java.util.Scanner;

/*у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.*/
public class Main {
    public static void main(String[] args) {
        Scanner inputAnswer = new Scanner(System.in);
        String Answer;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами? Ответьте здесь.");
        boolean exit = false;
        for (int i = 1; i<=3; i++) {
            if (exit==true)
                break;
            Answer = inputAnswer.nextLine();
            switch (Answer) {
                case "троллейбус":
                    System.out.println("Правильно! Обратитесь к администратору за подарком.");
                    exit=true;
                    break;
                case "Троллейбус":
                    System.out.println("Правильно! Обратитесь к администратору за подарком.");
                    exit=true;
                    break;
                case "сдаюсь":
                    System.out.println("Правильный ответ был: Троллейбус. Как же так?");
                    exit=true;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ был: Троллейбус. Как же так?");
                    exit=true;
                    break;
                default:
                    System.out.println("Подумай ещё, пожалуйста. Не сдавайся.\n");
            }
        }
    }
}
