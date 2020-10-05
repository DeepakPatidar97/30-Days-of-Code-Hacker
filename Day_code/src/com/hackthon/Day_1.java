package com.hackthon;
import java.util.*;
public class Day_1 {
		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);

	        int j = scan.nextInt();
	       
	        double c = scan.nextDouble();
	        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	       /* s += scan.next();*/
	        String ss = scan.nextLine();

	        System.out.println(i + j);
	        System.out.println(d + c);
	        System.out.println(s + ss);
	        

	       
	        scan.close();
	    }
	}

