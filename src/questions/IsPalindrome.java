package questions;

public class IsPalindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		isPalindrome(str);
		isPalindrome("Madam");
		isPalindrome("level");

	}
	
	static void isPalindrome(String str) {
		
		String reversed = "";
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			
			reversed += ch[i];
			
		}
		
		boolean result = str.equals(reversed);
		
		System.out.println(result);
		
		
	}
	
	
	//best version for interview
	static boolean isPalindrome1(String str) {

	    int left = 0;
	    int right = str.length() - 1;

	    while (left < right) {

	        if (str.charAt(left) != str.charAt(right)) {
	            return false;   // mismatch → not a palindrome
	        }

	        left++;
	        right--;
	    }

	    return true; // all characters matched
	}


}
