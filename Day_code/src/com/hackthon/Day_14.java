package com.hackthon;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
	private int[] elements;
	public int maximumDifference = 0;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		int value = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				value = elements[i] - elements[j];
				System.out.println(elements[i] + " " + elements[j] + " " + value);
				if (value < 0) {
					if (maximumDifference < value * -1) {
						maximumDifference = value * -1;
					}
				} else {
					if (maximumDifference < value) {
						maximumDifference = value;
					}
				}
			}
		}

	}

} // End of Difference class

public class Day_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}