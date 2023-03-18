package org.programsbasic;

public class StringPalindrome {
	public static void main(String[] args) {
		
		String s = "Malayalam";
		String rev = "";
		
		for(int i= s.length()-1;i>=0;i--) {
			
			char charAt = s.charAt(i);
			rev= rev+charAt;
			
			
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");

		}

		
		
		
		
		
		
		
		
		}
	}


