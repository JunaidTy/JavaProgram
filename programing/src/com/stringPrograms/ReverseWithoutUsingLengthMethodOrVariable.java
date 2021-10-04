package com.stringPrograms;

public class ReverseWithoutUsingLengthMethodOrVariable {

		public static void main(String[] args) {
			System.out.println("convert string to char array");
			String s1="reverse";
			System.out.println("s1:"+s1);
			char [] ch=s1.toCharArray();
			int count =0;
			for (char c : ch) {
				count++;
			}
			System.out.println(count);
			for(int i=count-1;i>=0;i--)
			{
				System.out.print(ch[i]);
			}
		}

	}
