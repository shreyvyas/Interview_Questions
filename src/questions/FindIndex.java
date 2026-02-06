package questions;

public class FindIndex {

	public static void main(String[] args) {
		
		int[] arr = {10,11,12,13,14,15};
		
		int num = findIndex(arr, 2);
		System.out.println(num);
		
		int num1 = findIndex(arr, 12);
		System.out.println(num1);

	}
	
	
	static int findIndex(int[] arr, int num) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == num) {
				return i;
			}
			
		}
		
		return -1;	
		
		
	}
	


}
