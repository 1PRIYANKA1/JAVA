class Slip17arm 
 {
    public static void main(String[] arg) 
    {
        int n = 0, j = 0, i = 0;
        int sum = 0, rem = 0, tmp = n;
        int arm[] = new int[arg.length];

        for (i = 0; i < arg.length; i++)
        {
            sum = 0;
            n = Integer.parseInt(arg[i]);
            tmp = n;
            while (n != 0) 
           {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            // Loop to store Armstrong numbers in the array
            if (tmp == sum) {
                arm[j] = tmp;
                j++;
            }
        }

        // Print Armstrong numbers array
        System.out.println("Armstrong numbers found:");
        for (i = 0; i < j; i++) {
            System.out.println(arm[i]);
        }
    }
}
