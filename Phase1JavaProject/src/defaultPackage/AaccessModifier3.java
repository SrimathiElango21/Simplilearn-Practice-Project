package defaultPackage;

class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}


public class AaccessModifier3 extends Animal{

	public static void main(String[] args) {
		AaccessModifier3 ac=new AaccessModifier3();
		ac.display();
	}

}
