package com.hackthon;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_09 {

    // Complete the factorial function below.
    static int factorial(int n) {
    	int sum=1;
    	for(int i=1;i<=n;i++) {
    		sum*=i;
    	}
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}
