package LabAssigment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculateSum {
	public static void main(String[] args) throws IOException 
	{

		System.out.print(" Please Enter any Number to Check whether it is Divisible by 3 or 5 : ");
		System.out.println("\n");
		System.out.println(calSum());
	}
	private static int calSum() throws IOException {
		int sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String l=br.readLine();
		int number1=Integer.parseInt(l);
		for(int i=1;i<=number1;i++) {
		
			if((i % 3 == 0) || (i % 5 == 0))
				sum=sum+i;
		}
		
				System.out.println("sum of the number divisible by 3 or 5"+sum);
			
		//15}
 return sum;
	}
}

		

