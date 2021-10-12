package com.stringPrograms;

public class SeperateAlphaNurmericAndSpecial {

	public static void main(String[] args) {
		String s="abc123@gmail.com";
		String alpha="";
		String numeric="";
		String splchr="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z')//a=97 z=122
			{                                      //A=65 Z=90
				alpha=alpha+s.charAt(i);           //0=48 9=57
			
				
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				numeric=numeric+s.charAt(i);	
			}
			else
			{
				splchr=splchr+s.charAt(i);
			}
		}
		System.out.println("Alpha :"+alpha);
		System.out.println("Numeric :"+numeric);
		System.out.println("SplChr :"+splchr);
	}

}
