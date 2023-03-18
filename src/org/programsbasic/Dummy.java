package org.programsbasic;

public class Dummy {
	public static void main(String[] args) {
		String s= "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444";
		int length = s.length();
		System.out.println(length);
		
		if (length<=50) {
			System.out.println("pass");
		}
			else if(length>50){
				System.out.println("fail");
			}
		}
	}


