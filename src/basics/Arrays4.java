package basics;

public class Arrays4 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		
		int[][] arr2 = {{1,2}, {3,4}, {5,6}};
		
		sumOfOneDArray(arr1);
		
		sumOfTwoDArray(arr2);

	}
	
	static void sumOfOneDArray(int[] arr) {
		
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			total = total + arr[i];			
		}
		
		System.out.println("Sum of 1-D Array: " +total);
		
	}
	
	static void sumOfTwoDArray(int[][] arr) {
		
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j< arr[i].length; j++) {
				
				total += arr[i][j];
				
			}			
		}
		
		System.out.println("Sum of 2-D Array: " +total);		
	}

}
