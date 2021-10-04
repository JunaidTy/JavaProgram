package com.stringPrograms;

import java.util.LinkedHashSet;

public class DublicateWordsInAGivenSentence {

	public static void main(String[] args) { 
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
			int count=0;
			for(int j=0;j<str.length;j++)
			{
				//If matching increase the count.
				if(ch.equals(str[j]))
				{
				count++;
			    }
			}
			if(count>1)
			{
			System.out.print(ch+":"+count+" ");
			}
	}
		
	}
	}
		
