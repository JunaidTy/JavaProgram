package com.pactice;

public class FirstAndLastOnly {

	public static void main(String[] args) {
		String s =" ";
		String j =" ";
		
		char a=s.charAt(0);
		//System.out.println(a);
		char b=j.charAt(j.length()-1);
		//System.out.println(b);
		
		if(a==' ' && b==' ')
		{
			System.out.println("##");
		}
		else if(b==' ')
		{
			b='#';
			System.out.print(a);
			System.out.print(b);
		}
		else if(a==' ')
		{
			a='#';
			System.out.print(a);
			System.out.println(b);
		}
		else
		{
			System.out.print(a);
			System.out.println(b);
		}
		
	}

}
