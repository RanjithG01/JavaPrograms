package org.programsbasic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VowelsOccurance {
	public static void main(String[] args) {
		String s = "welvomejavaaglosjnjn";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for(int i =0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			if(mp.containsKey(c)) {
				Integer inte = mp.get(c);
				mp.put(c, inte+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);

		
	}
	

}
