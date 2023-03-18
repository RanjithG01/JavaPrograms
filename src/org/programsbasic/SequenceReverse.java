package org.programsbasic;

import java.util.LinkedHashMap;
import java.util.Map;

public class SequenceReverse {
	public static void main(String[] args) {
		String rev = "", rev2="";

		String s = "Welcome To phython Class";
		String[] split = s.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			String s1 = split[i];
		//	System.out.println(s1);
			rev = rev + s1 + " ";
			}
		System.out.println(rev);
  
	}
		}
	 


