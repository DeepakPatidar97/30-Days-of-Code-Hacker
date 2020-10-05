package com.hackthon;

import java.util.*;

import javax.sound.midi.Soundbank;
;

public class Day_10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count=0,max=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        for(int i=binary.length()-1;i>=0;i--) {
        	if('1'==binary.charAt(i)) {
        		count++;
        	}else{
        		count=0;
        	}
        	if(count==binary.length()||max<count) {
        		max=count;
        	}
        }
        System.out.println("max = "+max);
        scanner.close();
    }
}
