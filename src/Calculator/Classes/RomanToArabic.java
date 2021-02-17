package Calculator.Classes;

public class RomanToArabic {
    int result;

    public RomanToArabic(int result) {
        this.result = result;
    }

    public String transformToArabic() {
        RomanNumbers romanNumbers = new RomanNumbers();
        String[] transform = romanNumbers.getRomanNumbers();
        String resultTransform = "";
        for (int i = 0; i < transform.length; i++) {
            if (result == i) {
                resultTransform = transform[i];
                break;
            }
        }
        return resultTransform;
    }
}
