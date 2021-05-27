package LabAssigment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {

	public static void main(String[] args) throws IOException {
		
		//System.out.println("Traffic Lights");
		System.out.println("Select any color");
		System.out.println(radioButton());
	}
		private static int radioButton() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String color=br.readLine();
		switch(color) {
		case "red":
			System.out.println("stop");
		break;
		case "yellow":
			System.out.println("ready");
		break;
		case "green":
			System.out.println("go");
		break;
		default:System.out.println("");
	    
	    
		}
		return 0;
		
			 

	}

}
