package basics;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		//numbers[3] = 4;
		
		System.out.println(numbers);
		
		System.out.println(numbers.toString());     //this is wrong, numbers does not have any toString() method
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] numbers1 = {4,5,6};
		
		System.out.println(Arrays.equals(numbers, numbers1));
		
		int[] result = testMethod(numbers, numbers1, 5);
		
		System.out.println(Arrays.toString(result));

	}
	
	static int[] testMethod(int[] arr1, int[] arr2, int num) {
		
		int[] result = new int[2];
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i] + arr2[j] == num) {
					result[0] = arr1[i];
					result[1] = arr2[j];
				}
				
			}
			
		}
		
		return result;
		
	}

}
