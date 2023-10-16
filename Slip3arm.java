// Write a ‘java’ program to check whether given number is Armstrong or not. (Use 
// static keyword)

import java.util.Scanner;

class Slip3arm {
    static int n;

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        Slip3arm.n = sc.nextInt();

        System.out.println("Entered number is: " + Slip3arm.n);

        int sum = 0, rem = 0, tmp = Slip3arm.n;
        while (Slip3arm.n != 0) {
            rem = Slip3arm.n % 10;
            sum = sum + (rem * rem * rem);
            Slip3arm.n = Slip3arm.n / 10;
        }

        Slip3arm.n = tmp; // Reset n to its original value

        System.out.println("Sum of cubes of digits: " + sum);
        if (tmp == sum) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
