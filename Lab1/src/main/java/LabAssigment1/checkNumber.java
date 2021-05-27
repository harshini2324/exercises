package LabAssigment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkNumber {
public static void main(String[]args) throws IOException {
	System.out.println("Enter a number:");
	boolean flag=false;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String l=br.readLine();
	int num=Integer.parseInt(l);
	
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
	}
}
}
