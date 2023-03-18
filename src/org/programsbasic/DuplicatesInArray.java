package org.programsbasic;

public class DuplicatesInArray {
	public static void main(String[] args) {

		int[] num = new int[10];
		num[0] = 5;
		num[1] = 8;
		num[2] = 8;
		num[3] = 6;
		num[4] = 2;
		num[5] = 3;
		num[6] = 5;
		num[7] = 4;
		num[8] = 9;
		num[9] = 50;
	
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if (num[i]==num[j]) {
				System.out.println(num[i]);
			}
		}
	}
	}
}
