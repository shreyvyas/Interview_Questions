package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		int[] arr = {5,2,9,1,5,6};
		
		//ascendingOrder_SortMethod(arr);     //using sort method

		//sortUsingCollections(arr);			//using Collections.sort()
		
		//sortUsingStream(arr);				//using stream
		
		sortUsingLoop(arr);
		
		int[] arr1 = {1,2,3,4,5,6,7};
		
		verifyArrayIsSorted(arr1);
		
	}
	
	static void ascendingOrder_SortMethod(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int num : arr) {
			System.out.println(num);
		}		
	}
	
	
	static void sortUsingCollections(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int num : arr) {
			list.add(num);
		}
		
		//System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
		
	}
	
	static void sortUsingStream(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		list = Arrays.stream(arr).boxed().sorted().toList();
		
		System.out.println(list);
		
		int[] sortedArr = list.stream().mapToInt(Integer::intValue).toArray();
		
		for(int num : sortedArr) {
			System.out.println(num);
		}
		
	}
	
	static void sortUsingLoop(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
			
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
	}
	
	static void verifyArrayIsSorted(int[] arr) {
		
		boolean result = true;
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i+1] < arr[i]) {
				result = false;
				break;
			}
			
		}
		
		System.out.println(result);	
		
	}
	

}



