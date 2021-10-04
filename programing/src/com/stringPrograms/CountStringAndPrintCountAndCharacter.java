package com.stringPrograms;

import java.util.LinkedHashSet;

public class CountStringAndPrintCountAndCharacter {

	public static void main(String[] args) {
		String s="mandya";
		//Create set collections(HashSet) and add all the char of given string into set.
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
		set.add(s.charAt(i));
		}
		//compare each char of set with all char of the given string.
		for (Character ch : set)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				//If matching increase the count.
				if(ch==s.charAt(j))
				count++;
			}
			//Print both char and count.
			System.out.print(ch+":"+count+" ");
		}
	}
}
