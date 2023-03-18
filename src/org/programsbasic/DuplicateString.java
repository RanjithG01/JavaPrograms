package org.programsbasic;

public class DuplicateString {
	public static void main(String[] args) {

		String s = "java";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = i+1; j < s.length(); j++) {
				char c1 = s.charAt(j);
				if (c==c1) {
					System.out.println(c1);
					
				}
				
			}
		}
	}
}
