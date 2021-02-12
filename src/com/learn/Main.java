package com.learn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        double drob1 = scan.nextDouble();
        double drob2 = scan.nextDouble();
        double drob3 = scan.nextDouble();
        System.out.println("Ваши дроби: " + drob1 + " " + drob2 + " " + drob3);
    }
}