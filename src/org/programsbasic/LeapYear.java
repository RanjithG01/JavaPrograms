package org.programsbasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class LeapYear {
	public static void main(String[] args) {
  
		System.out.println("print a number");
		Scanner scanner = new Scanner (System.in);
		int year = scanner.nextInt();
		
		if (year%4==0 && year%100!=0 || year %400 ==0 ) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
	
		}

			}

		}

	