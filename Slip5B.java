// Write a java program to display following pattern: 
// 5 
// 4 5 
// 3 4 5 
// 2 3 4 5 
// 1 2 3 4 5

public class Slip5B {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Outer loop for rows
        for (int i = n; i >= 1; i--) {
            // Inner loop for printing numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
