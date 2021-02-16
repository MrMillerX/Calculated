package Calculator.Classes;

import java.util.Scanner;

public class GetValue {
    Scanner getValue = new Scanner(System.in);

    public String value() {
        System.out.print("Пожалуйста, введите два числа, и знак вычисления: ");
        return getValue.nextLine();
    }

}
