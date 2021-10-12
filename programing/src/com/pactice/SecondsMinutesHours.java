package com.pactice;

import java.util.Scanner;

public class SecondsMinutesHours {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int sec = sc.nextInt();
		int hour = sec/3600;
		int min=(sec%3600)/60;
		int sec1=((sec%3600)%60);
		
		//System.out.println(hour);
		//System.out.println(min);
		//System.out.println(sec1);
		System.out.println(hour+":"+min+":"+sec1);

	}

}
