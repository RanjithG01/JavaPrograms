package org.programsbasic;

public class FirstLetterToCaps {
	public static void main(String[] args) {
		
		String s= "welcome to java class";
		String res="";
		
			
			String[] split = s.split(" ");
			for (int i = 0; i < split.length; i++) {
				String s4= split[i];
				char c = s4.charAt(0);
				char upperCase = Character.toUpperCase(c);
				String substring = s4.substring(1);
				res=res+upperCase+substring+" ";
		}
			System.out.println(res);
	}

}
