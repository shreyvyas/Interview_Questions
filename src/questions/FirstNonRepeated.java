package questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated {

	public static void main(String[] args) {
		
		String str = "automation";
		firstNonRepeated(str);

	}
	
	static void firstNonRepeated(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
			
		}
		
		
	}

}
