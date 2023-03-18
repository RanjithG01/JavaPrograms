package org.programsbasic;

import java.util.HashMap;
import java.util.Map;

public class CountParticularCharacter {
	
	public static void main(String[] args) {
	
		String s= "WelcomeTojavaclass";
		int counta =0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			if (c=='a') {
				counta++;
			}
			
		}
		System.out.println(counta);
	}

}
