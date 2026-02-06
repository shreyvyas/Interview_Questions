package questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepeatingSubString {

	public static void main(String[] args) {
		
		//sliding window
		//Remove characters from LEFT until the repeated character goes away.

		/*		        a                      → window = a
						a,b                    → window = a,b
						a,b,c                  → window = a,b,c
						a,b,c,a                → window = b,c,a
						a,b,c,a,b              → window = c,a,b
						a,b,c,a,b,c            → window = a,b,c
						a,b,c,a,b,c,b          → window = a,b,c,b             */
						
				longestSubstring("abcabcbb");
		

	}
	
	static void longestSubstring(String str) {
		
		int left = 0;
		int max = 0;
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(int right=0;  right<str.length(); right++) {
			
			while(set.contains(str.charAt(right))) {
				
				set.remove(str.charAt(left));
				
				left++;
				
			}
			
			set.add(str.charAt(right));
			max = Math.max(max, right-left+1);
			
		}
		
		System.out.println(max);
		System.out.println(set);
		
		
		
	}
	
	

}
