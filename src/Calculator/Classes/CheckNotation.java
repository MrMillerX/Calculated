package Calculator.Classes;

public class CheckNotation {
    String check = new String();

    //    GetValue value = new GetValue();
    public CheckNotation(String check) {
        this.check = check;
    }

    GetSplit getSplit = new GetSplit(check);

    public boolean checkNotationNums() {
        try {
            getSplit.getSplitNums();
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
//        check = check.replaceAll("\\s*", "");
//        String[] numbersResult = check.split("\\++|-+|\\*+|/+");
//        try{
//            int[] nums = new int[2];
//            nums[0] = Integer.parseInt(numbersResult[0]);
//        }
//        catch (NumberFormatException ex){
//            return false;
//        }
//    }
//    public int checkNotation(){
//        try {
//            check.matches();
//
//        }
//    }
//}