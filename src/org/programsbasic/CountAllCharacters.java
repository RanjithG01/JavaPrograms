package org.programsbasic;

public class CountAllCharacters {
	public static void main(String[] args) {
		
		String s = "WelcomeTo@World420";
		int u=0, l=0, sp=0, d=0;
				
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (Character.isUpperCase(c)) {
				u++;
			}else if (Character.isLowerCase(c)) {
				l++;
			}else if (Character.isDigit(c)) {
				d++;
			}else {
				sp++;
				
			}
		}
		System.out.println("UpperCase:"+u);
		System.out.println("LowerCase:"+l);
		System.out.println("Digits:"+d);
		System.out.println("SpecialCharacters:"+sp);
		


	

	}

}
