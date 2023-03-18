package org.programsbasic;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayandString {
	public static void main(String[] args) {

		String s = "ranjithis";
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));
	/*	String s1 = new String(charArray);
		System.out.println(s1);*/

		/*
		 * Integer [] a = new Integer [] {90, 23, 5, 109, 12, 22, 67, 34};
		 * 
		 * Arrays.sort(a,Collections.reverseOrder());
		 * 
		 * System.out.println(Arrays.toString(a));
		 */

		/*
		 * String [] s= {"mango", "apple", "kiwi", "pine", "jack", "jadhikka"};
		 * 
		 * Arrays.sort(s); System.out.println(Arrays.toString(s));
		 */

		/*
		 * String[] s = { "mango", "apple", "kiwi", "pine", "jack", "jadhikka" };
		 * Arrays.sort(s, Collections.reverseOrder());
		 * System.out.println(Arrays.toString(s));
		 */
	}

}
