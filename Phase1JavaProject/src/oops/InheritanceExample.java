package oops;

class Person{
	String name="Smith";
	int age=2;
	String city="Delhi";
	void display() {
		System.out.println("Person class is a super class");
	}
	
}
public class InheritanceExample extends Person {
	
	String dob="September 26";

	public static void main(String[] args) {
		
		InheritanceExample inher=new InheritanceExample();
		inher.display();
		
		System.out.println("Person Detail");
		System.out.println("Person Name : "+inher.name);
		System.out.println("Person Age : "+inher.age);
		System.out.println("Person City : "+inher.city );
		System.out.println("Person DOB : "+inher.dob);

		
		
	}

}
