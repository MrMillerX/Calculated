package Calculator.Classes;

public class GetSplit {
    String check;

    public GetSplit(String check) {
        this.check = check;
    }

    public int[] splitValue() {
        String[] splitResult = check.split("[+\\-*/]");
        int[] numbs = new int[2];
        numbs[0] = Integer.parseInt(splitResult[0]);
        numbs[1] = Integer.parseInt(splitResult[1]);
        return numbs;
    }

    public int[] transform() {
        RomanNumbers romanNumbers = new RomanNumbers();
        String[] transform = romanNumbers.getRomanNumbers();
        String[] splitResult = check.split("[+\\-*/]");
        int[] numbers = new int[2];
        String[] roman = new String[101];
        boolean compare;

        for (int i = 0; i < transform.length; i++) {
            roman[i] = transform[i];
            compare = splitResult[0].equals(roman[i]);
            if (compare) {
                numbers[0] = i;
                break;
            }
        }

        for (int i = 0; i < transform.length; i++) {
            roman[i] = transform[i];
            compare = splitResult[1].equals(roman[i]);
            if (compare) {
                numbers[1] = i;
                break;
            }
        }
        return numbers;
    }

    public String splitSign() {
        String splitResult;
        splitResult = check.replaceAll("[1234567890IVX]", "");
        return splitResult;
    }
}
