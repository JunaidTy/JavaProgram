package com.pactice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   System.out.println(dtf.format(now));

	}

}
