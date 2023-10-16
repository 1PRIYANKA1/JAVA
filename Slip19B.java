class Slip19B {
    public static void main(String args[]) 
    {
        int cnt = Integer.parseInt(args[0]);

        for (int i = 0, n1 = 0, n2 = 1; i < cnt; i++, n1 = n2, n2 = n1 + n2)

            System.out.print(n1 + " ");

        System.out.println(); // Print a new line after the Fibonacci series is displayed.
    }
}
