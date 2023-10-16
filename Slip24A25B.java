/*
Create a package named Series having three different classes to print series: i. 
Fibonacci series ii. Cube of numbers iii. Square of numbers. Write a java program to 
generate ‘n’ terms of the above series.
*/

import series.*;

public class Slip24A25B 
{
    public static void main(String[] args) {
        int n = 10; // Change 'n' to generate different terms of the series
        Fibo.generateSeries(n);
        Cube.generateSeries(n);
        Square.generateSeries(n);
    }
}
