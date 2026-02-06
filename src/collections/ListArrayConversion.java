package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		test1(arr);
		test2(arr);
		
		ArrayList<Integer> list = new ArrayList<>();
		test3(list);

	}
	
	
	//array to arraylist
	//option 1
	static void test1(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		for(Integer num : list) {
			System.out.println("From Option 1: "  +num);
		}
		
	}
	
	//array to arraylist
	//option 2
	static void test2(int[] arr) {
		
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		
		for(Integer num : list) {
			System.out.println("From Option 2: " +num);
		}
		
	}
	
	//arraylist to array
	//option 1
	static void test3(ArrayList<Integer> list) {
		
		//list = new ArrayList<>();             this is empty list, there will be empty output
		
		int[] arr = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			arr[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	//generic
	static <T> void test4(ArrayList<T> list) {
	    Object[] arr = list.toArray();
	    System.out.println(Arrays.toString(arr));
	}
	
	
	//arraylist to array
	//option 2
	


}
