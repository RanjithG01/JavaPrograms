package org.programsbasic;

public class ExtractAndAddOddNumbersOnly {

	public static void main(String[] args) {
     
		int num=12345, digits=0, sum=0;
		while(num!=0) {
				
				digits=num%10;
				if (digits%2!=0) {
					sum=sum+digits;}
				num=num/10;

			
			
		}
		System.out.println(sum);

	}

}
