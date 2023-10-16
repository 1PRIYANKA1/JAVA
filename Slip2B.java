// Write a java program to display all the vowels from a given string. 
// import java.util.Scanner;
import java.util.*;

public class Slip2B {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string:");
        String vw=sc.nextLine();
        for(int i=0;i<vw.length();i++)
        {
            char ch=vw.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("vowel:"+ch);           
            }                                                 
            else
            {
                System.out.println("constant");
            }
        }
    }
}
