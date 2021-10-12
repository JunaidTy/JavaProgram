package com.pactice;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		if(num1>25 && num2<75)
		{
			
			int r1 = num1%10;
			int r2=num2%10;
			if(r1==r2)
			{
				System.out.println("last no Same no");
			}
			else  
			{
				int r3=num1/10;
				int r4=num2/10;
			if(r3==r4)
				{
					System.out.println("first no Same no");
				}
			
			else
			{
		
				System.out.println("not same");
			}
			
			}
		}
		else
		{
			System.out.println("invalid no");
		}
	}}
		

	

