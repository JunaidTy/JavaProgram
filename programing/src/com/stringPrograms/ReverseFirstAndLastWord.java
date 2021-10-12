package com.stringPrograms;

public class ReverseFirstAndLastWord {

	public static void main(String[] args) {
		String str="Welcome to tyss";
		String[] st = str.split(" ");
		
			String temp=st[0];
			st[0]=st[st.length-1];
			st[st.length-1]=temp;
		
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
	}

}
