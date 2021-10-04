package com.stringPrograms;


public class ReverseStringWithoutThirdVariable {

	public static void main(String[] args) {
		
		String st="INDIA";
		//print in reverse order
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(st.charAt(i));
		}

	}

}
