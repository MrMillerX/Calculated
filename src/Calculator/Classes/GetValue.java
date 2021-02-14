package Calculator.Classes;

import java.util.Scanner;

public class GetValue {
    Scanner getValue = new Scanner(System.in);
    public String getNumbers(){
        System.out.print("Пожалуйста, введите два числа, и знак вычисления: ");
        String value = getValue.nextLine();
        return value;
    }

}
