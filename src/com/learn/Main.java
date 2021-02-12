package com.learn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите число 1, 2 или 3: ");
        double number = scan.nextDouble();
        if (number==1){
            System.out.println("Вы ввели число 1. Поздравляю.");
        }
        else if (number==2){
            System.out.println("Вы ввели число 2. Поздравляю.");
        }
        else if (number==3){
            System.out.println("Вы ввели число 3. Поздравляю.");
        }
        else{
            System.out.println("К сожалению, вы не поняли сути данного запроса. Соболезную.");
        }

    }
}