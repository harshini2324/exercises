package LabAssigment1;
//import java.util.Scanner;

import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) {
		int i,n;

	    System.out.print("Input number of terms : ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();

	     for(i=1;i<=n;i++)
	     {
	     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));  
	     in.close();
	     System.gc();
	    }
	}

}
