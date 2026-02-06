package questions;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		mergeArrays(arr1, arr2);

	}
	
	static void mergeArrays(int[] arr1, int[] arr2) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int num : arr1) {
			list.add(num);
		}
		
		for(int num : arr2) {
			list.add(num);
		}
		
		int[] mergeArray = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			mergeArray[i] = list.get(i);
		}
		
		for(int num : mergeArray) {
			System.out.println(num);
		}
		
	}

}
