package Calculator.Classes;

public class CheckNotation {
    String check;

    //    GetValue value = new GetValue();
    public CheckNotation(String check) {
        this.check = check;
    }

    public boolean checkNotationNumbs() {
        String[] numbersResult = check.split("\\++|-+|\\*+|/+");
        try {
            int[] numbs = new int[2];
            numbs[0] = Integer.parseInt(numbersResult[0]);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

}
