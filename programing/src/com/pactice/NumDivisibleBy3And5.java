package com.pactice;


public class NumDivisibleBy3And5 {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();*/
		for(int num=0;num<=100;num++)
		if(num%3==0 && num%5==0)
		{
			System.out.print(num+" ");
		}

	}

}
