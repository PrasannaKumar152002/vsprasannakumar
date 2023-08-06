package Week6;

public class Assignment1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		// System.out.println();
		t2.start();
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("Thread1 is running......." + Thread1.currentThread() + " ");
			try {
				Thread1.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("Thread2 is running......." + Thread1.currentThread());
			try {
				Thread2.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
