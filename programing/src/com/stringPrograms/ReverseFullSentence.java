package com.stringPrograms;

import java.util.LinkedHashSet;

public class ReverseFullSentence 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Before reversing:");
		String s="welcome to tyss";
		String [] str = s.split(" ");
		//Create set collections(HashSet) and add all the String of given string into set.
		//LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		//set.add(str[i]);
		}
		System.out.println("\nAfter reversing:");
		for(int j=str.length-1;j>=0;j--)
		{
			System.out.print(str[j]+" ");
		}		
	}	
}
	
		
