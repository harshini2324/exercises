package LabAssigment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	public static void main(String arg[]) throws IOException	
	{
	int i,count;
               System.out.print("Enter n value : ");
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       		String l=br.readLine();
       		int n=Integer.parseInt(l);
               System.out.println("Prime numbers between 1 to "+n+" are ");
	for(int j=2;j<=n;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(j+"  ");     
	}
	}
}
