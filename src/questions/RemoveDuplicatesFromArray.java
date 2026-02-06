package questions;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,6,5,4,3,2,1};
		removeDuplicates(arr);

	}
	
	static void removeDuplicates(int[] arr) {
		
		int[] removed = Arrays.stream(arr).distinct().toArray();
		
		for(int num : removed) {
			System.out.println(num);
		}
		
	}

}

//set to array if set is used
//int[] unique = set.stream().mapToInt(i -> i).toArray();
