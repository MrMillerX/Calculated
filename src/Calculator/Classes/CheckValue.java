package Calculator.Classes;

public class CheckValue {
    String check;
    public CheckValue(String check){
        this.check = check;
    }
    public boolean getCheckValue(){
        boolean b =check.matches("[1234567890ivxlcIVXLC+\\-*/]+");
        return b;
    }
}
