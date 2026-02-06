package questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepeated {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		str = str.toLowerCase();
		
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
		
		System.out.println(map);
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				list.add(entry.getKey());
			}
		}
		
		System.out.println("List: " +list);
		
		System.out.println("List last element: " +list.getLast());          //if Java 21
		
		System.out.println("If not Java 21: " + list.get(list.size()-1));

	}

}
