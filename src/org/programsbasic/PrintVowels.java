package org.programsbasic;

public class PrintVowels {
	public static void main(String[] args) {
		
		String s = "welcome to java", v="", con="";
		int vo=0;
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='u'||c=='o') {
				
				v=v+c;
				vo++;
			
			}else {
				
				con=con+c;
			}
		}
		System.out.println("Vowels are:"+v);
		System.out.println(vo);
		System.out.println("Consonants are:"+con);


		
		
		
		
		
	}

}
