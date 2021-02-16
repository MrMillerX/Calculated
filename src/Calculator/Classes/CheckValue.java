package Calculator.Classes;

public class CheckValue {
    String check;

    public CheckValue(String check) {
        this.check = check;
    }

    public boolean getCheckValue() {
        return check.matches("[1234567890ivxlcIVXLC+\\-*/]+");
    }
}
