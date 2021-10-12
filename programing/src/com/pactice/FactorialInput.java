package com.pactice;

import java.util.Scanner;

public class FactorialInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				count=count+1;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("count:"+count);
	}

}
