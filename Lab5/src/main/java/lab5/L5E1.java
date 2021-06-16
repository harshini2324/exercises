package lab5;

import java.util.Scanner;

public class L5E1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter age of the Person:");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		System.out.println("Entered age is in Limit");
		try {
			if(age>15)
				throw new Exception("Age of Person should be below 15");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
