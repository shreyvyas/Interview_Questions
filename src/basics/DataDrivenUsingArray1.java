package basics;

public class DataDrivenUsingArray1 {

	public static void main(String[] args) {
		
		String[][] testData = {{"username1", "password1"}, {"username2", "password2"}};
		
		readTestData2(testData);

	}
	
	static void readTestData(String[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.println(arr[i][0]);
				
				System.out.println(arr[i][1]);
				
			}
			
		}
		
	}
	
	static void readTestData1(String[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i][0] + " " + arr[i][1]);
			
		}
		
	}
	
	static void readTestData2(String[][] arr) {
		
//		String username = arr[i][0];
//		String password = arr[i][1];
		
		for(int i=0; i<arr.length; i++) {
			
			String username = arr[i][0];
			String password = arr[i][1];
			
			System.out.println(username);
			System.out.println(password);
			
		}
		
		
	}

}
