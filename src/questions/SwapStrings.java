package questions;

public class SwapStrings {

	public static void main(String[] args) {
		
		String str1 = "shrey";
		String str2 = "vyas";
		
		swapString(str1, str2);

	}
	
	static void swapString(String str1, String str2) {
		
		//shrey  vyas -> shreyvyas
		
		System.out.println("str1 current value: " +str1);
		System.out.println("str2 current value: " +str2);
		
		str1 = str1 + str2;              //shreyvyas
		
		str2 = str1.substring(0, str1.length() - str2.length());      //0 to 5
		
		str1 = str1.substring(str2.length());
		
		System.out.println("str1 after swap value: " +str1);
		System.out.println("str2 after swap value: " +str2);
		
	}

}
