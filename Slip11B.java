import java.util.Scanner;

class Slip11B {
  public static void main(String arg[]) {
    int r = 0;
    System.out.println("1.add");
    System.out.println("2.sub");
    System.out.println("3.mul");
    System.out.println("4.div");
    System.out.println("Enter your choice");

    Scanner sc = new Scanner(System.in);
    int ch = sc.nextInt();
    int a = Integer.parseInt(arg[0]);
    int b = Integer.parseInt(arg[1]);

    switch (ch) {
      case 1:
        r = a + b;
        break;
      case 2:
        r = a - b;
        break;
      case 3:
        r = a * b;
        break;
      case 4:
        r = a / b;
        break;
      default:
        System.out.println("Invalid choice");
        return;
    }
    System.out.println("Result: " + r);
  }
}
