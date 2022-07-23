package assPracticeProject;


public class MyThreadExample extends Thread {

	public void run() {
		System.out.println("Thread class...");
	}
	public static void main(String[] args) {
		MyThreadExample mythread=new MyThreadExample();
		mythread.run();
		
	}

}
