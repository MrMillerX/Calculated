package Calculator.Classes;

public class GetSplit {
    public String splitValue;
    public GetSplit(String value) {
        splitValue = value;
    }
    public int[] splitNums(){
        String[] splitResult = splitValue.split("\\s*(\\s|,|!|\\.|\\+|-|/|\\*)\\s*");
            int[] nums = new int[2];
            nums[0] = Integer.parseInt(splitResult[0]);
            nums[1] = Integer.parseInt(splitResult[1]);
            return nums;
    }
    public String[] splitRomanNums(){
        String[] splitResult = splitValue.split("\\s*(\\s|,|!|\\.|\\+|-|/|\\*)\\s*");
        String[] romanNums = new String[5];
        romanNums[0] = splitResult[0];
        romanNums[1] = splitResult[1];
        return romanNums;
    }
    public String splitSign(){
        String[] splitResult = splitValue.split("\\s*(\\s|,|!|\\.)\\s*");
        String sign = splitResult[1];
        return sign;
    }
}
