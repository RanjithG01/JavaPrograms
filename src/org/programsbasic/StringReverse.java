package org.programsbasic;

public class StringReverse {
	public static void main(String[] args) {

		String s = "Welcome to my class";
		String rev = "";

		for (int i = s.length()-1; i >=0; i--) {	

			char charAt = s.charAt(i);
			rev=rev+charAt;
          
		}
		System.out.println(rev);

	}

}
