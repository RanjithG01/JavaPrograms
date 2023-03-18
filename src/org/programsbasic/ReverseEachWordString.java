package org.programsbasic;

public class ReverseEachWordString {
	public static void main(String[] args) {

		String s1 = "ranjith is a good boy", reverse = "";
		
	    String[] split = s1.split(" ");
	    
			for (int i = 0; i < split.length; i++) {
				String words= split[i];
             String s2="";
             
             for (int j =words.length()-1; j>=0; j--) {
				char charAt = words.charAt(j);
				s2=s2+charAt;
			}
             reverse=reverse+s2+" ";
			}
			System.out.println(reverse);
		}

		
	}

	

