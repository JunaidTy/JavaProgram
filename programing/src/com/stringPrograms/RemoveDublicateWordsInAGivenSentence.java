package com.stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDublicateWordsInAGivenSentence 
{

	public static void main(String[] args) 
	{ 
		String s="welcome to tyss to work";
		String [] str = s.split(" ");
		//Create set collections(HashSet) and add all the String of given string into set.
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
		set.add(str[i]);
		}
		//compare each String of set with all String of the given string.
		for (String ch : set)
		{
			System.out.print(ch+" ");	
	    }
	}
}
		
