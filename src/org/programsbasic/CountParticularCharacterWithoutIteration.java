package org.programsbasic;

public class CountParticularCharacterWithoutIteration {
	public static void main(String[] args) {
		
		String s = "Welcome to Java Class";
		int a=0;
		
		int totalLength = s.length();
		System.out.println(totalLength);
		
		int afterRemovingA = s.replace("a", "").length();
		System.out.println(afterRemovingA);
		
		a=totalLength-afterRemovingA;
		System.out.println(a);
	}

}
