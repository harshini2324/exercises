package LabAssigment1;

import java.util.Scanner;

public class checkNumber {
public static void main(String[]args) {
	int num;
	boolean flag=false;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	num=sc.nextInt();
	int currentdigit = num%10;
	num = num/10;
	while(num>0) {
		if(currentdigit<=num%10) {
			flag = true;
			break;
		}
		currentdigit = num % 10;
		num = num/10;
	}
	if(flag) {
		System.out.println("Digits are not  in increasing order");
	}
	else {
		System.out.println("Digits are  in increasing order");
	}sc.close();
}
}
