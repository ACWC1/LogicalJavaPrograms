package com.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = scanner.nextInt();
		int remainder;
		int reverse = 0;
		
		while (num > 0 )
		{
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
			
		}
		System.out.println("Reverse Number : "+reverse);
		scanner.close();

	}

}
