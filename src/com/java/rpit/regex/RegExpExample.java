package com.java.rpit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {
	public static void main(String args[]){
		String  s ="((?=.*[^a-zA-Z])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,22})";
		Pattern pattern = Pattern.compile(s);
		String password ="Crunchify123~";
		Matcher matcher = pattern.matcher(password);
		System.out.println(matcher.matches());
	}
}
