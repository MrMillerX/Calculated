package Calculator.Main;

import Calculator.Classes.*;

public class MainMain {
    public static void main(String[] args) {

        GetValue getValue = new GetValue();
        String value = getValue.value();

        CheckValue checkValue = new CheckValue(value);
        boolean check = checkValue.getCheckValue();
        if (check==false){
            System.out.println("К сожалению, вы ввели неправильное выражение. Повторите попытку снова.");
        }
        else {


        GetSplit getSplit = new GetSplit(value);

        int num1;
        int num2;

        CheckNotation checkNotation = new CheckNotation(value);
        boolean checkResult = checkNotation.checkNotationNums();

        if (checkResult==true){
            int[] numbers = getSplit.getSplitNums();
            num1 = numbers[0];
            num2 = numbers[1];
        }
        else {
            RomanToArabic romanNumbers = new RomanToArabic(value);
            int[] numbers = romanNumbers.transform();
            num1 = numbers[0];
            num2 = numbers[1];
        }



        String sign = getSplit.getSplitSign();
        char[] signChar = sign.toCharArray();
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
            int result = getCalculation.division();
            System.out.println(result);
        }
        else {
            System.out.println("Ничего не получилось.");
            }

        }

    }

}
