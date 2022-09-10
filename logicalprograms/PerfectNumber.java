package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Number to check Perrfect Numberr or Not : ");
		int num = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				sum += i;
				System.out.println("Divisers are :"+i);
			}
		}
		if (num == sum)
		{
			System.out.println("Number is Perfect Number!!!");
		}
		else
		{
			System.out.println("Number is Not Perfect  Number");
		}
		scanner.close();
	}

}

