package com.hackthon;

import java.util.*;

public class Day_11 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum=0,max=0;        
        for (int j = 0; j < 4; j++) {            
            for (int i = 0; i < 4; i++) {
                sum=0;
                for(int k=0+i;k<3+i;k++) {                    
                    for (int l = 0+j; l < 3+j; l++) {
                        if(((k-i)!=1 || ((l-j)!=0))  &&  ((k-i)!=1 || ((l-j)!=2)))
                               sum+=arr[k][l];
                        else
                            sum+=0;
                    }
                }
                if(max<sum)
                    max=sum;
                
                if (max == 0 && sum < max) {
                    max = sum;
                } else if (max < sum && sum < 0) {
                    max = sum;
                }
                }
        }
                     
        
        
        System.out.println(max);	
        scanner.close();
    }
}
/*

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int max = -9 * 7;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > max) max = sum;
                }
            }
        }

        
        System.out.println(max);
        scanner.close();
    }
}*/
