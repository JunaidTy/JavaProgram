package com.pactice;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Number:");
		 int num = obj.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count = count +1;
			}
			
		}
		if(count == 2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("No Prime Number");
		}
		

	}

}
