package com.pactice;

import java.util.Scanner;

public class PrintThreeCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		if(str.length()==3)
		{
			System.out.println(str);
		}
		else if(str.length()>=3)
			{
				for(int i=0;i<=2;i++)
				{
					System.out.print(str.charAt(i));
				}
			}
		else if(str.length()<=3)
		{
			int a=str.length();
			String s=str;
			String h="#";
			for(int k=a;k<=2;k++)
			{
				s=s+h;
					
			}
			System.out.println(s);		
		}
		else if(str.length()==0)
		{
			System.out.println("###");
		}

	}

}
