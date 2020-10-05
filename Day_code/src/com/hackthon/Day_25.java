package com.hackthon;

import java.util.Scanner;

public class Day_25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int j=1;j<=T;j++) {
			int val = scan.nextInt();
		    
		    for(int i=2; i<=val/i; i++){
		    if(val%i==0) val=1;
		    }

		    if(val==1) System.out.println("Not prime");
		    else System.out.println("Prime");
		}
	}
}
