package org.programsbasic;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int num=0, num1=1, num2=0,num3=10;
		
		System.out.print(num+" "+num1);
		
		for(int i=2; i<num3;i++) {
			num2=num+num1;
			System.out.print(" "+num2);
			num=num1;
			num1=num2;
		}
	}

}
