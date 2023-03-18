package org.programsbasic;

public class CountNoOfVowels {
	public static void main(String[] args) {
 
		String s = "welcome";
		int v = 0, con=0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				v++;
            }else {
            	con++;
            }
}
		System.out.println("Vowels count is :"+v);
		System.out.println("Consonant count is :"+con);


	}
}
