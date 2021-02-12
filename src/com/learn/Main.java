package com.learn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.1415;
        double p;
        System.out.print("Введите значение Радиуса круга:\nR = ");
        int r = scan.nextInt();
        p = 2 * PI * r;
        System.out.println("Периметр круга равен " + p + " см");
    }
}