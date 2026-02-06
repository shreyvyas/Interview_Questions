package questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		
		String str = "aaabbcccc";
		stringCompression(str);

	}
	
	static void stringCompression(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			
			if(map.containsKey(c)) {
				map.put(c,  map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			sb.append(entry.getKey());
			sb.append(entry.getValue());
			
		}
		
		System.out.println(sb.toString());
		
		
	}

}
