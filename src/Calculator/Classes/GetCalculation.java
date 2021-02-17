package Calculator.Classes;

public class GetCalculation {
    int num1;
    int num2;
    char[] sign;
    int result;
    int signInt;

    public GetCalculation(int num1, int num2, char[] sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public int result() {
        signInt = sign[0];
        switch (signInt) {
            case 43 -> result = num1 + num2;
            case 45 -> result = num1 - num2;
            case 42 -> result = num1 * num2;
            case 47 -> result = num1 / num2;
            default -> System.out.println("Ничего не получилось. Почему?");
        }
        return result;
    }
}