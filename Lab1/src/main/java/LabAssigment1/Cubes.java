package LabAssigment1;
//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cubes {

	public static void main(String[] args) throws IOException {
		int i;

	    System.out.print("Input number of terms : ");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String l=br.readLine();
		int n=Integer.parseInt(l);

	     for(i=1;i<=n;i++)
	     {
	     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));  
	     
	    }
	}

}
