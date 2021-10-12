package com.pactice;

public class LastWordOfSentence {

	public static void main(String[] args) {
		String s="I m Lazy";
		String[] str = s.split(" ");
		System.out.println(str[str.length-2]);

	}

}
