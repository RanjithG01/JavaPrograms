package org.programsbasic;

public class PrintAllCharacters {
	public static void main(String[] args) {
		
		String s = "WelcomeTo@World420", u="", l="", d="", sp="";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				u=u+c;
				
			}
			else if(Character.isLowerCase(c)) {
				l=l+c;
			}
			else if (Character.isDigit(c)) {
				d=d+c;
			}else {
				sp=sp+c;
			}
		}
		System.out.println("UpperCase:"+u);
		System.out.println("LowerCase:"+l);
		System.out.println("Digits:"+d);
		System.out.println("SpecialCharacters:"+sp);
	}

}
