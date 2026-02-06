package questions;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AutomationString {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		str = str.toLowerCase();   //automation
		
		//automin
		
		char[] ch = str.toCharArray();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c : ch) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Character c : set) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		
		

	}

}
