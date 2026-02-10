package basics;

public class DataDrivenUsingArray1 {

	public static void main(String[] args) {
		
		String[][] testData = {{"username1", "password1"}, {"username2", "password2"}};
		
		readTestData(testData);

	}
	
	static void readTestData(String[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.println(arr[i][0]);
				
				System.out.println(arr[i][1]);
				
			}
			
		}
		
	}

}
