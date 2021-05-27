package LabAssigment1;

import java.util.Scanner;

public class powerofNumber {

	private static int n;

	public static void main(String[] args) {
		
		boolean i = powerOfTwo();
		System.out.println(i);	

	}

	private static boolean powerOfTwo() {
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		
		n = s.nextInt();
		
		while(n%2==0)
		 {
		 n=n/2;
		 }
		 if(n==1)
		 {
		 return true;
		 }
		 else
		 {
		 return false;
		 }
			
	}
		
		
}

