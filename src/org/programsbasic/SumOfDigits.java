package org.programsbasic;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 654321;
		int rem = 0;
		int sum = 0;

		while (num != 0) {

			rem = num % 10; // To get the last digit of the number 1
			sum = sum + rem; // 1
			num = num / 10; // To remove the last digit of the number 65432
		}
		System.out.println(sum); // 21
	}

}
