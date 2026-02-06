package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//arraylist
		//can store any datatype, duplicates are allowed, maintains insertion order
		
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("javascript");
		
		for(String value: list) {
			System.out.println(value);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list);
		}
		
		int[] arr = {1,2,3};
		
		//List<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
		//arr here is primitive array, it will treat entire array as one single element
		//need to convert it to wrapper class Integer
		
		List<Integer> list1 = Arrays.stream(arr).boxed().toList();                //stream: stream to IntStream
		for(Integer num : list1) {												 //boxed: convert each int to Integer
			System.out.println(num);											//toList: collects into a List<Integer>								
		}
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));
		for(Integer num : list2) {
			System.out.println(num);
		}
		
		//addAll also works for Integer 
		
		

	}

}
