package basics;

public class Array6 {

	public static void main(String[] args) {
		
		int[][] arr = {
			    {10, 20, 30},
			    {40, 50, 60}
			};
		
		sumOfEveryRow(arr);
		
		sumOfEveryCol(arr);

	}
	
	static void sumOfEveryRow(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int total = 0;
			
			for(int j=0; j<arr[i].length; j++) {
				
				total += arr[i][j];				
				
			}
			
			System.out.println("Total of Row " + i + ": " + total);
			
		}
		
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

}
