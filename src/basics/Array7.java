package basics;

public class Array7 {

	public static void main(String[] args) {
		
		int[][] arr = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		//sumOfEveryCol(arr);
		
		//sumOfEveryRow(arr);
		
		sumOfDiaognal(arr);

	}
	
	static void sumOfEveryCol(int[][] arr) {
		
		for(int j=0; j<arr[0].length; j++) {
			
			int total = 0;
			
			for(int i=0; i<arr.length; i++) {				
				
				total += arr[i][j];				
			}
			
			System.out.println(total);
			
		}
		
	}
	
	static void sumOfEveryRow(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int total = 0;
			
			for(int j=0; j<arr[i].length; j++) {
				
				total += arr[i][j];
				
			}
			
			System.out.println(total);
		}
		
	}
	
	static void sumOfDiaognal(int[][] arr) {
		
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			total += arr[i][i];
			
		}
		
		System.out.println(total);
	}

}
