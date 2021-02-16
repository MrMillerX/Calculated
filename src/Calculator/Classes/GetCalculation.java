package Calculator.Classes;

public class GetCalculation {
    int num1;
    int num2;
    int result;

    public GetCalculation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {

        result = num1 + num2;
        return result;
    }

    public int subtraction() {
        result = num1 - num2;
        return result;
    }

    public int multiplication() {
        result = num1 * num2;
        return result;
    }

    public int division() {
        result = num1 / num2;
        return result;
    }
}