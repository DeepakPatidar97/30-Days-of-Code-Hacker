package com.hackthon;

import java.util.Scanner;

/*public class Day_3 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==0) {
            if(N>1 && N<6){
                System.out.println("Not Weird");}
            else if(N>5&&N<21) {
                System.out.println("Weird");}
            else if(N>20) {
                System.out.println("Not Weird");}
        }
        else{
            System.out.println("Weird");
        }
        scanner.close();
    }
}
*/

public class Day_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s=scan.nextLine();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
