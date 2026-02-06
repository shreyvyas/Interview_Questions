package questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Automation_PrintNumber {

	public static void main(String[] args) {
		
		printAutomationNumber("automation");

	}
	
	static void printAutomationNumber(String str) {
		
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
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>1) {
				sb.append(entry.getValue());
			}
			else {
				sb.append(entry.getKey());
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}
