package com.hackthon;

import java.util.*;
import java.io.*;

class Calculator{
	int power(int n,int p) throws Exception {
		int pow=1;
		if(!(n<0 || p<0)) {
			while(p-- !=0) {
				pow = pow*n;
			}
		}
		else
		 throw	new Exception("n and p should be non-negative");
		
		
		
		return pow;
	}
}

public class Day_17{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
