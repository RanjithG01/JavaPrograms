package org.programsbasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelsInString {
	public static void main(String[] args) {

		String s = "Ranjith is good boy";
		char[] ch = s.toCharArray();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				if (mp.containsKey(c)) {
					Integer integer = mp.get(c);
				//	System.out.println(integer);
					mp.put(c, integer+1);
				}
				else {
					mp.put(c, 1);
				}
			}

		}
	/*	Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);*/
		System.out.println(mp);

		}
	}

