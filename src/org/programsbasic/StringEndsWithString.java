package org.programsbasic;

public class StringEndsWithString {
	public static void main(String[] args) {
		String s1= "Welcome";
		String s2= "come";
		int count=0;
		for(int i=s1.length()-1 ,j=s2.length()-1;j>=0;i--,j--) {
			if(s1.charAt(i)==s2.charAt(j)) {
			
				count++;
			}
		}
		
	if(count==s2.length())
		
	{
		System.out.println("yes");
	}else
	{
		System.out.println("no");
	}System.out.println(count);
}}
		
		
