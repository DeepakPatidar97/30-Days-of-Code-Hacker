package com.hackthon;
import java.util.Scanner;

public class Day_6 {
	private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	    	int n = scanner.nextInt();
	    	String s = null;
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        for(int i=0;i<n;i++) {
	        	s=scanner.next();
	        	reView(s);
	        }
	        
	    }
	    
	    public static void reView(String str){
	    	int length = str.length();
	    	String evenstr="",oddstr="";
	    	for(int i=0;i<length;i++) {
	    		if(i%2==0) {
	    			evenstr+=str.charAt(i);
	    		}else {
	    			oddstr+=str.charAt(i);
	    		}
	    	}
	    	System.out.println(evenstr+" "+oddstr);
	    }
}
