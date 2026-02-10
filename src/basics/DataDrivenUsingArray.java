package basics;

public class DataDrivenUsingArray {

	public static void main(String[] args) {
		
		String[][] testData = {{"username1", "password1"}, {"username2", "password2"}};
		
		passingData(testData);

	}
	
	public static void passingData(String[][] testData) {
		
		for(int i=0; i<testData.length; i++) {
			
			for(int j=0; j<testData[i].length; j++) {
				
				System.out.println(testData[i][j]);
				
			}
			
		}
		
		
	}

}
