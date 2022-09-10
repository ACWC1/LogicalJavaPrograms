package com.logicalprograms;

import java.util.Scanner;

public class PrimeNUmber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter the Number to check the Prime Number : ");
		int num = scanner.nextInt();
		boolean flag = true;
		for (int divisor = 2; divisor < num / 2; divisor++)
		{
			if(num % divisor == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println(" Number is Prime Number !!!");
		}
		else
		{
			System.out.println(" Number is Not Prime !!!");
		}
		scanner.close();
	}

}
