package assPracticeProject;

class Student{
	 int id;
	 String ch;
	 String name;
	 //Parameterized Constructor
	 Student(int a,String b,String n){
		 System.out.println("Constructor Value ");
		 id=a;
		 ch=b;	
		 name=n;
		 
	 }
	void show() {
		System.out.println("Student id :"+id+" Course :"+ch+" Name: "+name);

	 }
}

public class ConstructorExample {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
	    Student s = new Student(1,"Java","XXXX");  
	    s.show();
	    	

	}

}
