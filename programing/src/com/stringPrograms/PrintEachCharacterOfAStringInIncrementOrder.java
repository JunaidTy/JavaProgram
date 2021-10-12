package com.stringPrograms;

public class PrintEachCharacterOfAStringInIncrementOrder {

	public static void main(String[] args) {
		String s="INDIA";
		String initial="";
		for(int i=0;i<s.length();i++)
		{
			initial=initial+s.charAt(i);
			System.out.println(initial);
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.substring(0, i+1));
		}
	}
}
