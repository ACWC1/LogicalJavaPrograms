package com.logicalprograms;

import java.util.Scanner;

public class CouponNumber {
	
	public static int CouponGenerator() {
		
		int coupon = (int) Math.floor(Math.random() * 10000);	
		
		return coupon;
	}

	public static void main(String[] args) {
	
		System.out.print("How many coupons you have to genrate : ");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		System.out.println("Genrated coupons are : ");
		for (int i = 0; i < count; i++) {
			System.out.println(CouponGenerator());
		}
		
		scanner.close();
	}

}
