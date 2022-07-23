package assPracticeProject;

class OuterClass {
	  int x = 10;

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}

//anonymous class
abstract class dog{
	abstract void color();
}
public class innerClassExample {

	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.myInnerMethod());
	    
	    dog Dog=new dog() { //anonymous class
	    	void color() {
	    		System.out.println("Red");
	    	}
	    };
	    
	Dog.color();	
	}

}
