package Calculator.Classes;

public class CheckValue {
    String check;

    public CheckValue(String check) {
        this.check = check;
    }

    public boolean getCheckRight() {
        return check.matches("([1-9]{1,2}|10|I{1,4}|IV|V|VI|VII|VIII|IX|X){1,4}[+\\-*/]([1-9]{1,2}|10|I{1,4}|IV|V|VI|VII|VIII|IX|X){1,4}");
    }


    public boolean checkNotation() {
        return check.matches("([1-9]?|10)[+\\-*/]([1-9]?|10)");
    }

    public boolean checkSpelling() {
        boolean checker1 = check.matches("(\\d+)(.)(.)+");
        boolean checker2 = check.matches("(.){1,4}(.)(\\d+)");
        return checker1 || checker2;
    }

}
