package basics;

public class Arrays5 {
	
	public static void main(String[] args) {
		
		int[][] arr = {
			    {10, 20, 30},
			    {40, 50, 60}
			};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		printOnlyFirstCol(arr);
		printColWise(arr);
	}
	
	static void printOnlyFirstCol(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i][0]);
			
		}
		
	}
	
	static void printColWise(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.println(arr[j][i]);
				
			}
			
		}
		
	}
	

}
