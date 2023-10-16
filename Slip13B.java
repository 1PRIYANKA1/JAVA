
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slip13B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        ArrayList<String> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list.add(s.next());
        }

        s.close();
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);
    }
}
