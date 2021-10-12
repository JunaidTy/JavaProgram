package com.pactice;

import java.util.Scanner;

public class ThreeNo {

	static boolean num() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int x = sc.nextInt();
		System.out.println("Enter 2nd No:");
		int y=sc.nextInt();
		System.out.println("Enter 3rd No:");
		int z=sc.nextInt();
		
		if(x-y>z && z>=20)
		{
			return true;
		}
		else if(y-z>x && x>=20)
		{
			return true;
		}
		else if(z-x>y && y>=20)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
public static void main(String[] args) {
	boolean s= num();
	System.out.println(s);
}
}
