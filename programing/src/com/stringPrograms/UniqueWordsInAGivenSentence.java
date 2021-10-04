package com.stringPrograms;

import java.util.LinkedHashSet;

public class UniqueWordsInAGivenSentence {

	public static void main(String[] args) { 
		String s="welcome to tyss to work";
		String [] str = s.split(" ");
		//Create set collections(HashSet) and add all the char of given string into set.
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
		set.add(str[i]);
		}
		//compare each char of set with all char of the given string.
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
			}	//Print both char and count.
			if(count==1)
			{
			System.out.print(ch+":"+count+" ");
			}
		
	}
		
	}
	}
		
