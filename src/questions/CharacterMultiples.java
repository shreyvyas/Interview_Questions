package questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterMultiples {

	public static void main(String[] args) {
		
		String str = "abrcjacavbcdh";
		characterMultiple(str);

	}
	
	//A program where you find how many times each character appears in a string
	
	static void characterMultiple(String str) {
		
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println(map);
		
		
	}

}
