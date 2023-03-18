package org.programsbasic;

public class ExtractDigits {
	public static void main(String[] args) {
		int num=12345, digits=0;
		
		while (num!=0) {
			digits=num%10;
			num=num/10;
			System.out.println(digits);
		}

		}
	}


