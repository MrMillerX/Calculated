package Calculator.Classes;

public class GetSplit {
    GetValue getValue = new GetValue();
    public int[] splitNums(){
        String[] splitResult = getValue.getNumbers().split("\\s*(\\s|,|!|\\.)\\s*");
        int num1 = Integer.parseInt(splitResult[0]);
        int num2 = Integer.parseInt(splitResult[2]);
        return new int[]{num1, num2};
    }
    public String splitSign(){
        String[] splitResult = getValue.getNumbers().split("\\s*(\\s|,|!|\\.)\\s*");
        String Sign = splitResult[1];
        return Sign;
    }
}
