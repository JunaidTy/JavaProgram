package com.stringPrograms;


public class ReverseStringWithUsingThirdVariable2 {

	public static void main(String[] args) {
		
		String st="INDIA";
		System.out.println(st);
		//print in reverse order
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(rev+st.charAt(i));
		}
	}
}
