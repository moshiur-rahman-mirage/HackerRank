package com;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem2 {
	
    public static void main(String[] args) throws IOException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
       BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
       

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2=Integer.parseInt(scan.readLine().trim());
        d2=Integer.parseInt(scan.readLine().trim());
        s2=scan.readLine().trim();
        
       
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s.concat(s2));
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}