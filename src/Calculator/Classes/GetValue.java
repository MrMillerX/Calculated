package Calculator.Classes;

import java.util.Scanner;

public class GetValue {
    Scanner getValue = new Scanner(System.in);

    public String value() {
        System.out.print("Пожалуйста, введите два числа (Римских или Арабских) от 1 до 10 включительно, и знак вычисления между ними, в формате: \"1 + 1\": ");
        return getValue.nextLine();
    }

}
