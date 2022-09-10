package com.logicalprograms;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Start Time : ");
		float stime = scanner.nextFloat();
		
		System.out.println("Enter the End Time : ");
		float etime = scanner.nextFloat();
		float result = 0;
		
		result = etime - stime;
		
		System.out.println("The Differance between Start Time and End Time is : "+result+" Hrs");
		
		scanner.close();
		
		
		
	}

}
