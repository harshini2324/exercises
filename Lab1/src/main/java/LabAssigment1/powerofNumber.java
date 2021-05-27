package LabAssigment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class powerofNumber {

	private static int n;

	public static void main(String[] args) throws IOException {
		System.out.println("enter the number");
		boolean i = powerOfTwo();
		System.out.println(i);	

	}

	private static boolean powerOfTwo() throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String l=br.readLine();
		 n=Integer.parseInt(l);
		
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

