package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintVowelAndConsonent {
	public static void main(String[] args) {
		String sentance = "The quick brown fox jumps over the lazy dog.";
		ArrayList<Character> vowels = new ArrayList<>();
		ArrayList<Character> consonent = new ArrayList<>();
		char[] stringArray = sentance.toCharArray();
		for (int i = 0; i < sentance.length(); i++) {
			char ch = sentance.charAt(i);
			if(isVowel(ch)) {
				vowels.add(ch);
			}else if(ch!=' ') {
				consonent.add(ch);
			}
		}
		
		for(char x:vowels) {
			System.out.println(x);
		}
		for(char x:consonent) {
			System.out.println(x);
		}
	}

	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}