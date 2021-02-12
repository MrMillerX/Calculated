import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Напишите всё, что хотите: ");
        String phrase = scan.nextLine();
        System.out.println("Вы сказали: "+phrase);
    }
}