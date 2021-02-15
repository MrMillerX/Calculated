package Calculator.Main;

import Calculator.Classes.CheckNotation;
import Calculator.Classes.GetCalculation;
import Calculator.Classes.GetSplit;
import Calculator.Classes.GetValue;

public class MainMain {
    public static void main(String[] args) {

        GetValue getValue = new GetValue();
        String value = getValue.value();

        CheckNotation checkNotation = new CheckNotation(value);
        boolean checkResult = checkNotation.checkNotationNums();


        GetSplit getSplit = new GetSplit(value);

        int[] numbers = getSplit.getSplitNums();
        int num1 = numbers[0];
        int num2 = numbers[1];
        String sign = getSplit.getSplitSign();
        char[] signChar = new char[1];
        signChar = sign.toCharArray();
        char c = signChar[0];
        int a = c;

        GetCalculation getCalculation = new GetCalculation(num1,num2);
        if (a == 43) {
            int result = getCalculation.addition();
            System.out.println(result);
        }
        else if (a == 45) {
            int result = getCalculation.subtraction();
            System.out.println(result);
        }
        else if (a == 42) {
            int result = getCalculation.multiplication();
            System.out.println(result);
        }
        else if (a == 47) {
            double result = getCalculation.division();
            System.out.println(result);
        }
        else {
            System.out.println("Ничего не получилось.");
        }

    }

}
