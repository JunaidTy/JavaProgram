package com.pactice;

public class SP1 {

	public static void main(String[] args) {
		String sp="As 123, hea:Ven@";
		int letter=0;
		int space=0;
		int number=0;
		int special=0;
		for(int i=0;i<sp.length();i++)
		{
				if(sp.charAt(i)>='a'&& sp.charAt(i)<='z'||sp.charAt(i)>='A'&& sp.charAt(i)<='Z')
				{                                      
					//letter=letter+sp.charAt(i); 
					letter++;
				}
				else if(sp.charAt(i)>='0' && sp.charAt(i)<='9')
				{
					//number=number+sp.charAt(i);
					number++;
				}
				else if(sp.charAt(i)==' ')
				{
					//space=space+sp.charAt(i);
					space++;
				}
				else
				{
					//special=special+sp.charAt(i);
					special++;
				}
		}
		System.out.println("letter:"+letter);
		System.out.println("number:"+number);
		System.out.println("space:"+space);
		System.out.println("special"+special);
		

	}

}
