package org.programsbasic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	

		public static void main(String[] args) {
			String s= "ranjith jims pranav";
			String[] split = s.split(" ");
			List<String> l= new ArrayList<String>();
			l = Arrays.asList(split);
			for (int i = 0; i < l.size(); i++) {
	                String string = l.get(i);
	                System.out.println(string);
			}
			
			
			
		}

	}



