package com.pactice;

public class ReverseFirstAndLastCharacter {

	public static void main(String[] args) {
		String s="Welcome to Banlore from Muri";
		String[] str = s.split(" ");
		
			String  temp=str[0];
			str[0]=str[str.length-1];
			str[str.length-1]=temp;
			
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.print(str[i]+" ");
			
			
		}

	}

}
