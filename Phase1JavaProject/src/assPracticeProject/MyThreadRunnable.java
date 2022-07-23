package assPracticeProject;

public class MyThreadRunnable implements Run {

	public static void main(String[] args) {
		Thread th=new Thread();
		th.start();
		System.out.println("Get name :"+th.getName());
	}
	public void display() {
		System.out.println("Thread Runnable");
	}

}
