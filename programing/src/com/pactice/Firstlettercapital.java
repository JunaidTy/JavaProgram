package com.pactice;

public class Firstlettercapital {

	public static void main(String[] args) {
		String str="JUNAID is in banglore ABCD";
		String [] sp=str.split(" ");
		for(int a=0;a<sp.length;a++)
		{
			//sp[0]="JUNAID"
			sp[a] = sp[a].substring(0,1).toUpperCase()+sp[a].substring(1).toLowerCase();
		}
		//String as=" "+sp;
		String as = String.join(" ",sp);
		System.out.println(as);
	}
}
