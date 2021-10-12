package com.pactice;

public class Practice1 {

	public static void main(String[] args) {
		String s="Welcome to Banglore";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String as=str[i];
			for(int j=as.length()-1;j>=0;j--)
			{
				System.out.print(as.charAt(j));
			}
			System.out.print(" ");
			
			
		}

	}

}
