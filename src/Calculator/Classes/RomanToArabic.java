package Calculator.Classes;

public class RomanToArabic {
    RomanNumbers romanNumbers = new RomanNumbers();
    String splitValue;

    public RomanToArabic(String splitValue) {
        this.splitValue = splitValue;
    }

    public int[] transform() {
        String[] transform = romanNumbers.getRomanNumbers();
        splitValue = splitValue.replaceAll("\\s*", "");
        String[] splitResult = splitValue.split("\\++|-+|\\*+|/+");
        int[] numbers = new int[2];
        splitResult[0] = splitResult[0].toUpperCase();
        splitResult[1] = splitResult[1].toUpperCase();
        String[] roman = new String[101];
        boolean compare;

        for (int i = 0; i < transform.length; i++) {
            roman[i] = transform[i];
            compare = splitResult[0].equals(roman[i]);
            if (compare) {
                numbers[0] = i;
            }
        }

        for (int i = 0; i < transform.length; i++) {
            roman[i] = transform[i];
            compare = splitResult[1].equals(roman[i]);
            if (compare) {
                numbers[1] = i;
            }
        }
        System.out.println(numbers[0] + " " + numbers[1]);
        return numbers;
    }
}