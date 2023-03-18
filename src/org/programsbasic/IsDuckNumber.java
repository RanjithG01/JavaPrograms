package org.programsbasic;

public class IsDuckNumber {
	public static void main(String[] args) {
		int num = 1230, digit = 0;
		boolean isDuck = false;

		while (num != 0) {
			digit = num % 10;
			if (digit == 0) {
				isDuck = true;
				break;

			}
			num=num/10;

		}
		if(isDuck) {
			System.out.println("Duck Number");
		}
		else {
			System.out.println("Not A Duck Number");
		}

	}
}
