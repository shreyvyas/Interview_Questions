package questions;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,10,2,3};
		largestNumber(arr);
		largestNumber1(arr);

	}
	
	static void largestNumber(int[] arr) {
		
		int lNum = 0;
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] < arr[i-1]) {
				lNum = arr[i-1];
			}
			else {
				lNum = arr[i];
			}			
			
		}
		
		System.out.println(lNum);			//this code will not work for {1,10,2,3}
	}
	
	static void largestNumber1(int[] arr) {
		
		int lNum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] > lNum) {
				lNum = arr[i];
			}			
		}
		
		System.out.println(lNum);
		
	}
	
	static void secondLargest(int[] arr) {
		
//		int firstLargest = Integer.MIN_VALUE;
//		int secondLargest = Integer.MIN_VALUE;
		
		
		
	}

}
