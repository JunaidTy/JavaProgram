package com.pactice;

public class InsertWordInBetween {

	public static void main(String[] args) {
		String s="welcome banglore";
		String ins="to";
		int index=s.length()/2;
		String newString="";
		{
			  newString = s.substring(0,index)+ ins+" "+ s.substring(index);
		}
		System.out.println(newString);
		
	}

}
