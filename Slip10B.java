import java.util.Scanner;

public class Slip10B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);

        scanner.close();
    }
}
