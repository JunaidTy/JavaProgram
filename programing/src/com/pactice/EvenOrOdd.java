package com.pactice;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}

}
