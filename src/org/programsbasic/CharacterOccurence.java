package org.programsbasic;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
	public static void main(String[] args) {

		String s = "Welcwome To javaa class";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (mp.containsKey(ch)) {
				Integer inte = mp.get(ch);
				mp.put(ch, inte + 1);
			} else {
				mp.put(ch, 1);

			}
		}

		System.out.println(mp);

	}

}
