package org.programsbasic;

public class ReverseTheNumber {

	public static void main(String[] args) {

		int num = 456;
		int rem = 0;
		int rev = 0;

		while (num > 0) {

			rem = num % 10; // 6 TO get the last digit from number
			rev = rev * 10 + rem; // 0*10+6
			num = num / 10; // 456/10=45 To remove the last digit from number

		}
		System.out.println(rev);

	}

}
