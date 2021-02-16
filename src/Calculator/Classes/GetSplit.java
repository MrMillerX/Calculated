package Calculator.Classes;

public class GetSplit {
    public String splitValue;

    public GetSplit(String splitValue) {
        this.splitValue = splitValue;
    }

    public int[] getSplitNumbs() {
        splitValue = splitValue.replaceAll("\\s*", "");
        String[] splitResult = splitValue.split("\\++|-+|\\*+|/+");
        int[] numbs = new int[2];
        numbs[0] = Integer.parseInt(splitResult[0]);
        numbs[1] = Integer.parseInt(splitResult[1]);
        return numbs;

    }

    public String getSplitSign() {
        String splitResult;
        splitValue = splitValue.replaceAll("\\s*", "");
        splitResult = splitValue.replaceAll("[1234567890ivxlcIVXLC]", "");
        return splitResult;
    }
}
