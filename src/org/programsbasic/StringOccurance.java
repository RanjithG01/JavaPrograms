package org.programsbasic;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
	public static void main(String[] args) {
		
	
	String s= "WelcomeToJavaMain";
	Map<Character, Integer> mp = new HashMap<Character,Integer>();
	
	for (int i = 0; i < s.length(); i++) {
		
		char c = s.charAt(i);
		Integer integer = mp.get(c);
		if(mp.containsKey(c)) {
			mp.put(c, integer+1);
		}
		else {
			mp.put(c, 1);
		}
	}
	System.out.println(mp);
	

}
}
