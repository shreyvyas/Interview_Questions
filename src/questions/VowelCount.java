package questions;

public class VowelCount {

	public static void main(String[] args) {
		
		String str = "automation";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
				count += 1;
			}			
		}
		
		System.out.println(count);

	}
	
	static void vowelCount_Contains(String str) {
		
		
		
	}
	
	static void vowelCount_regex(String str) {
		
		
		
	}

}
