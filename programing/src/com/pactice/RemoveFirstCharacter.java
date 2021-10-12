package com.pactice;

public class RemoveFirstCharacter {

	public static void main(String[] args) {
		String a="Welcome";
		String b="Banglore";
		String c="";
		String d="";
		for(int i=1;i<=a.length()-1;i++)
		{
			c=c+a.charAt(i);
		}
		//System.out.println(c);
		for(int k=1;k<=b.length()-1;k++)
		{
			d=d+b.charAt(k);
		}
		//System.out.println(d);
		System.out.println(c+d);
	}

}
