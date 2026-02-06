package questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestConsecutive {

	public static void main(String[] args) {
		

		
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
