package questions;

public class ReverseConcepts {

	public static void main(String[] args) {
		
		String str = "Shrey Vyas";
		reverseString(str);     
		reverseString1(str);

	}
	
	static void reverseString(String str) {
		
		String reversed = "";
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			
			reversed += ch[i];
			
		}
		
		System.out.println(reversed);
		
	}
	
	//above code will reverse "shrey vyas" to "sayV yerhS"
	//but we want "yerhS sayV"

	
	static void reverseString1(String str) {
		
		
		String[] words = str.split(" ");
		
//		for(String val : str1) {
//			System.out.println(val);
//		}
		
		String reversed = "";
		
		for(int i=0; i<words.length; i++) {
			
			char[] ch = words[i].toCharArray();
			
			for(int i1=ch.length-1; i1>=0; i1--) {
				
				reversed += ch[i1];
				
			}		
			
			reversed += " ";
		}
		
		System.out.println(reversed.trim());
		
	}
	
}
