package LabAssigment1;

import java.util.Scanner;

public class calculateDifference {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInput, sumOfTheSquare = 0, squareOfTheSum = 0, totalDifference = 0,sumNum=0;
		
		System.out.println("----------A program to find the difference between the sum of the squares of the first n natural numbers and the square of their sum----------");
		System.out.println("");
		System.out.println("Please enter the value : ");
		
		userInput = scanner.nextInt();
		scanner.close();
		
		if(userInput>=1) {
			
			for(int i=0;i<=userInput;i++) {
				sumOfTheSquare =(i * (i + 1) * (2 * i + 1)) / 6;
				
			}
			
			for(int i=0;i<=userInput;i++) {
				sumNum =(i * ( i+ 1)) / 2;
			}
			
			squareOfTheSum = sumNum *sumNum;
			totalDifference = Math.abs(sumOfTheSquare - squareOfTheSum);
			System.out.println("The difference " + totalDifference);
		}
	}

}
