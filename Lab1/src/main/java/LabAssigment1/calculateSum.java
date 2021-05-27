package LabAssigment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculateSum {
	public static void main(String[] args) throws IOException 
	{
		System.out.print(" Please Enter any Number to Check whether it is Divisible by 3 or 5 : ");
		System.out.println(calSum());
	}
	private static int calSum() throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String l=br.readLine();
		int number1=Integer.parseInt(l);
		
			if((number1 % 3 == 0) || (number1 % 5 == 0))
			{
				System.out.println("\n Given number " + number1 + " is Divisible by 3 or 5"); 
			}
			else {
				System.out.println("number is not divisible by 3 or 5");
			}
			
		
	
	return number1;
	}
}
		

