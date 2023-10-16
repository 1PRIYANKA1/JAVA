// Write a java program to accept a number from user, if it zero then throw user 
// defined Exception “Number Is Zero”, otherwise calculate the sum of first and last 
// digit of that number. (Use static keyword).

import java.util.Scanner;

public class Slip6B {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Number is 0");
        } else {
            int lastDigit = n % 10;
            int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));

            int sum = firstDigit + lastDigit;
            System.out.println("Sum is: " + sum);
        }
    }
}
