package basics;

public class Arrays2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		String str[] = new String[2];
		
		System.out.println(numbers);
		
		System.out.println(str);
		
		System.out.println(numbers.length);
		
		System.out.println(str.length);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
