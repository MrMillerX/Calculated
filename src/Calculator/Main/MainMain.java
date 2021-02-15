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

        GetSplit getSplit = new GetSplit(value);
        String sign = getSplit.getSplitSign();
        int[] numbers = getSplit.getSplitNums();
        int num1 = numbers[0];
        int num2 = numbers[1];

        GetCalculation getCalculation = new GetCalculation(num1,num2);
        if (sign == "+") {
            int result = getCalculation.addition();
            System.out.println(result);
        }
        else if (sign == "-") {
            int result = getCalculation.subtraction();
            System.out.println(result);
        }
        else if (sign == "*") {
            int result = getCalculation.multiplication();
            System.out.println(result);
        }
        else if (sign == "/") {
            double result = getCalculation.division();
            System.out.println(result);
        }
        //        String[] value1 = getSplit.getSplitValue();
//        System.out.println(value1[0]+" "+value1[1]);
//
//        System.out.println(getSplit.splitValue);

    }

}
