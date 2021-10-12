package com.pactice;

public class Practice2 {

	public static void main(String[] args) {
		String s="abcd1234@@@";
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				int num1=Character.getNumericValue(s.charAt(i));
				num=num+num1;
			}
		}
		System.out.println(num);
	}
	}


