package com.stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDulicateCharactersInGivenString {

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
				System.out.print(ch);	
		}	

	}

}
