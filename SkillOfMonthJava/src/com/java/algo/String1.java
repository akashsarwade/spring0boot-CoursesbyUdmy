package com.java.algo;

public class String1 {

	public static boolean isPasswordComplex(String s) {
		return s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase)
				&& s.chars().anyMatch(Character::isDigit);
	}

//	Reverse Sentence

	public static String reverseSentence(String sentence) {
		if (sentence == null || sentence.isEmpty()) {

			return "";
		}

		StringBuilder result = new StringBuilder();
		String[] words = sentence.split("");
		for (String word : words) {
			result.append(reverseString(word));
			result.append("");

		}
		result.trimToSize();

		return result.toString();
	}

//	Reverse world

	public static String reverseString(String r) {
		if (r == null || r.isEmpty()) {
			return r;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = r.length() - 1; i >= 0; i--) {
			sb.append(r.charAt(i));

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(isPasswordComplex("AKASH0"));
		System.out.println(isPasswordComplex("fbvjust"));
		System.out.println(isPasswordComplex("Helksjdbcuwf7futlo"));
		System.out.println(isPasswordComplex("1726"));

		System.out.println(reverseString("AKASH"));
		
		System.out.println(reverseSentence("Akash Madhukar Sarwade"));

	}
}
