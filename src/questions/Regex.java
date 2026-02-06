package questions;

public class Regex {

	public static void main(String[] args) {
		
		//[a,b,c] - a or b or c
		
		//[^a-z] - negation - except a to z
		
		//[^0-9] - except 0 to 9
		
		//b[aeiou]g - bag, beg, big, bog, bog
		
		//[A-Za-z0-9]
		
		// \d - digit
		
		// \w - word character
		
		// \s - whitespace
		
		//Negations: \D \W \S are opposites.
		
		vowelCount("automation");
		
		countOnlyCharacter("Hello World 123!");

	}
	
	static void vowelCount(String str) {
		
		int count = str.replaceAll("[^aeiou]", "").length();
		
		System.out.println(count);		
		
	}
	
	static void countOnlyCharacter(String str) {
		
		//String str = "Hello World 123!";
		
		int count = str.replaceAll("[^a-zA-Z]", "").length();
		System.out.println(count);		
	}
	
	
	
	
	

}
