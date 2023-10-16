// Write a ‘java’ program to copy only non-numeric data from one file to another file. 

import java.io.*;
import java.util.*;

class Slip1A {
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name :");
        String sfile = sc.next();
        System.out.print("Provide destination file name :");
        String dfile = sc.next();
        FileReader fin = new FileReader(sfile);      
        FileWriter fout = new FileWriter(dfile);      
        int c;
        while ((c = fin.read()) != -1) {                      
            if (!Character.isDigit((char) c)) {                        
                fout.write(c);
            }
        }
        System.out.println("Copy finish...");
        fin.close();
        fout.close();
    }
}
