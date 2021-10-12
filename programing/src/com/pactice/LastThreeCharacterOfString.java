package com.pactice;

public class LastThreeCharacterOfString {

	public static void main(String[] args) {
		String s="welcome to bangglore from muri";
		String[] str = s.split(" ");
		String last = str[str.length-1];
		for(int i=last.length()-3;i<last.length();i++)
		{
			System.out.print(last.charAt(i));
		}
		

	}

}
