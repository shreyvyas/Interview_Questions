package questions;

public class Fibonacci {

	public static void main(String[] args) {
		
		fibonacciSeries(5);

	}
	
	static void fibonacciSeries(int n) {
		
		//0,1,1,2,3,5,8
		//here first 2 values are fixed 0 and 1
		
		int a = 0;
		int b = 1;
		
		for(int i=0; i<n; i++) {
			
			System.out.println(a);
			
			int temp = a + b;
			
			a = b;
			b = temp;
			
		}
		

	}
	

}
