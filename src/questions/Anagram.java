package questions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		
		anagram(str1, str2);

	}
	
	//verfiy two string are anagram
	
	static void anagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean isAnagram = Arrays.equals(ch1, ch2);
		
		System.out.println(isAnagram);
		
	}

}
