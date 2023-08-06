package Week6;

public class Assignment5 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
		System.out.println("The name of the Thread1 : " + t1.getName());
		System.out.println("The name of the Thread2 : " + t2.getName());
		t1.setName("Week 6 Assignment Q5 ");
		t2.setName("Week 6 Assignment Q5 New");
		System.out.println("The name of the Thread1 : " + t1.getName());
		System.out.println("The name of the Thread2 : " + t2.getName());
	}
}

class T1 extends Thread {
	@Override
	public void run() {
	}
}

class T2 extends Thread {
	@Override
	public void run() {
	}
}