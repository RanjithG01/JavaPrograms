package org.programsbasic;

public class CountOfDigit {
	public static void main(String[] args) {

		int num = 789654, count = 0;

		while (num != 0) {

			num = num / 10; // To remove the last number

			count++;
		}
		System.out.println(count);

	}
}
