import java.io.*;
import java.util.*;

    public class Slip21B{
    public static void main(String[]args) throws IOException
    {
        Scanner sc= new Scanner(new File("target.txt"));

        while(sc.hasNext()){
            String word=sc.next();
            System.out.println(new StringBuilder(word).reverse());
        }
        sc.close();
    }
}

