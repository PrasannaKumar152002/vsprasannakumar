package Week6;

public class Assignment3 {
	public static void main(String[] args) {
		B b=new MyThread();
		b.run();
	}
}

interface A {
	public void run();
}

class B implements A {
	public void run() {
	}
}

class MyThread extends B {
	public void run() {
		System.out.print("NPTEL Java week-6 new Assignment Q3");
	}
}
