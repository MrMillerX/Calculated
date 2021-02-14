package Calculator.Main;

import Calculator.Classes.GetSplit;

public class Main {
    public static void main(String[] args) {
//        GetValue getValue = new GetValue();
        GetSplit getSplit = new GetSplit();
//        System.out.println(getValue.getNumbers());
        int num[] = getSplit.splitSign();
        System.out.println("Ваше число теперь: "+(num+5));
    }
}
