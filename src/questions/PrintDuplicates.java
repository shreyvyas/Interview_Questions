package questions;

//import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,2,3,4};
		
		printDuplicates(arr);

	}

	static void printDuplicates(int[] arr) {
		
//		int[] arr1 = Arrays.stream(arr).distinct().toArray();
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int num : arr) {
			
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
		
		
		
	}


}
