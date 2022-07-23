package assPracticeProject;

public class CallByValue {
	
	public static void swap(int a,int b) {
		a=20;
		b=50;
		
		System.out.println("Method inside a = "+a+" and "+" b = "+b+" value");

		
	}

	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println("Before Value : a ="+a+" and "+" b = "+b);
	
		swap(a,b);
		
		System.out.println("After value : a ="+a+" and "+" b = "+b);
		
	}
	

}
