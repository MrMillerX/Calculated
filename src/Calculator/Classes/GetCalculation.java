package Calculator.Classes;

public class GetCalculation {
    int num1;
    int num2;
    double resultDouble;
    int resultInt;

    public GetCalculation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {

        resultInt = num1 + num2;
        return resultInt;
    }

    public int subtraction() {
        resultInt = num1 - num2;
        return resultInt;
    }

    public int multiplication() {
        resultInt = num1 * num2;
        return resultInt;
    }

    public double division() {
        resultDouble = num1 / num2;
        return resultDouble;
    }
}