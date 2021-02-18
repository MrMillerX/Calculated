package Calculator.Main;

import Calculator.Classes.*;

public class MainMain {
    public static void main(String[] args) {

        GetValue getValue = new GetValue();
        String value = getValue.value();
        value = value.replaceAll("\\s*", "");
        value = value.toUpperCase();

        CheckValue checkValue = new CheckValue(value);
        boolean checkRight = checkValue.getCheckRight();
        if (!checkRight) {
            System.out.println("\nВведённое выражение неверно. Попробуйте снова," +
                    " но на этот раз по формату \"1 + 1\", c числами от 1 до 10 включительно.");
        } else {
            boolean checkNotation = checkValue.checkNotation();

            int num1;
            int num2;

            GetSplit getSplit = new GetSplit(value);

            String sign = getSplit.splitSign();
            char[] signChar = sign.toCharArray();

            if (checkNotation) {                                                                                        //Если Арабские.
                int[] numbers = getSplit.splitValue();
                num1 = numbers[0];
                num2 = numbers[1];

                GetCalculation getCalculation = new GetCalculation(num1, num2, signChar);
                int result = getCalculation.result();
                System.out.println("\nОтвет: " + result);

            } else {                                                                                                    //Если Римские.
                boolean resultChecker = checkValue.checkSpelling();
                if (resultChecker) {
                    System.out.println("\nК сожалению, вы ввели выражение, содержащее и Римские и Арабские цифры." +
                            " Повторите снова, но на этот раз с одним типом чисел.");
                } else {                                                                                                //Если Только римские.
                    int[] numbers = getSplit.transform();
                    num1 = numbers[0];
                    num2 = numbers[1];

                    GetCalculation getCalculation = new GetCalculation(num1, num2, signChar);
                    int result = getCalculation.result();
                    if (result < 0) {
                        System.out.println("\nК сожалению, не существует отрицательных Римских чисел. Попробуйте другое" +
                                " выражение.");
                    } else if (result == 0) {
                        System.out.println("\nК сожалению, в римских цифрах не существует Нуля. Но ответ, очевидно, 0.");
                    } else {
                        RomanToArabic romanToArabic = new RomanToArabic(result);
                        String romanResult = romanToArabic.transformToArabic();
                        System.out.println("\nОтвет: " + romanResult);
                    }
                }
            }
        }
    }
}
