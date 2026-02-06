package oops;

public class OOPS1 {
	
	int num = 10;                                //properties
	String name = "Shrey";

	public static void main(String[] args) {
		
		OOPS1 obj = new OOPS1();
		obj.getData();

	}
	
	public void getData() {                         //methods
		
		System.out.println(num);
		System.out.println(name);
		
	}

}
