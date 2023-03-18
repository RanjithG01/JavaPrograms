package org.programsbasic;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumbersInArray {
	public static void main(String[] args) {
		
		int num[] = new int [] {1,2,3,5,5,2,1,8,10,2,7,9};
		Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
		
		for (int i = 0; i < num.length; i++) {
		int l=	num[i];
		if (mp.containsKey(l)) {
			Integer integer = mp.get(l);
			mp.put(l, integer+1);
		}
		else {
			mp.put(l, 1);
		}
		}
		
	//	System.out.println(mp);
		Set<Integer> values =new HashSet<Integer> (mp.values());
		System.out.println(values);
		
		
		
		
		
	}

}
