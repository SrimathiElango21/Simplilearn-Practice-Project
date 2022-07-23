package assPracticeProject;


class MethodExample2{
	
	int a=10;
	int b=20;
	public int show;
	
	public void show(MethodExample a) {
		System.out.println("Method Print a integer Value : " + a);
	}
    public void show(char a,int b) {
		System.out.println("Method Overloading" );
	}
}

public class MethodExample {
	
	
	public static void main(String[] args) {
		
		MethodExample2 method=new MethodExample2();
		
		method.show=5;
		method.show('A',5);
		
	}

}
