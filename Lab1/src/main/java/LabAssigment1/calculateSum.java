package LabAssigment1;

import java.util.Scanner;

public class calculateSum {
	public static void main(String[] args) 
	{
		System.out.println(calSum());
	}
	private static int calSum() {
		int number;
		 Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number to Check whether it is Divisible by 3 or 5 : ");
		number = sc.nextInt();	
		
			if((number % 3 == 0) || (number % 5 == 0))
			{
				System.out.println("\n Given number " + number + " is Divisible by 3 or 5"); 
			}
			else {
				System.out.println("number is not divisible by 3 or 5");
			}
			
		
	sc.close();
	return number;
	}
}
		

