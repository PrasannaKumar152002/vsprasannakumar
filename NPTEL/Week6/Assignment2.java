package Week6;

public class Assignment2 implements Runnable {
	public static void main(String[] args) {
		Run r=new Run();
		Assignment2 as=new Assignment2();
		Thread t1=new Thread(r);
		Thread t2=new Thread(as);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("Main Thread ended");
	}
}
class Run implements Runnable{
	@Override
	public void run() {
		System.out.println("Welcome to Java Week 6 New Question");
	}
}