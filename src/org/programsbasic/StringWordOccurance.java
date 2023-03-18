package org.programsbasic;

import java.util.HashMap;
import java.util.Map;

public class StringWordOccurance {
	public static void main(String[] args) {
		
		String s = "Welcome javaaa course javaa javaaa Course welcome python";
		Map<String, Integer> mp = new HashMap<String, Integer>();
	
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
		String s1=	split[i];
			
			if (mp.containsKey(s1)) {
				
				Integer integer = mp.get(s1);
				mp.put(s1, integer+1);
			}
			else {
				mp.put(s1, 1);
			}
		}
		System.out.println(mp);

	}
}
