package questions;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {3,4,5,7,8};
		
		commonElements(arr1, arr2);
		
		commonElements1(arr1, arr2);

	}
	
	/*
	 
	 ✅ Union → addAll()

	 ✅ Intersection → retainAll()

	 ✅ Difference → removeAll()
	
	 */
	
	//O(n*m) time complexity
	static void commonElements(int[] arr1, int[] arr2) {
		
		Set<Integer> set1 = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i] == arr2[j]) {
					set1.add(arr1[i]);
				}
				
			}
			
		}
		
		for(Integer num : set1) {
			System.out.println(num);
		}		
		
	}
	
	static void commonElements1(int[] arr1, int[] arr2) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonElements = new HashSet<>();
		
		for(int num : arr1) {
			set1.add(num);
		}
		
		for(int num : arr2) {
			if(set1.contains(num)) {
				commonElements.add(num);
			}
		}
		
		for(Integer num : commonElements) {
			System.out.println(num);
		}
		
	}

	
}
