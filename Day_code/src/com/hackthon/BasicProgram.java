package com.hackthon;

public class BasicProgram {
	public static void main(String[] args) {
		String s = "aeiouia";
		int k = 3;
		/*
		 * String s="caberqiiefg"; int k=5;
		 */

		String substr = subVowel(s, k);
		System.out.println(substr);
	}

	private static String subVowel(String str, int k) {
		int count = str.length();
		String sub = null, sub1 = null;
		int c = 0, temp = 0;
		for (int i = 0; i < count && (i + 5) != count; i++) {
			sub = str.substring(i, k + i);
			c = 0;
			for (int j = 0; j < k; j++) {
				if ('a' == sub.charAt(j) || 'e' == sub.charAt(j) || 'i' == sub.charAt(j) || 'o' == sub.charAt(j)
						|| 'u' == sub.charAt(j)) {
					c++;
				}
			}
			if (temp < c) {
				temp = c;
				sub1 = sub;
			}
		}
		return sub1;
	}
}
