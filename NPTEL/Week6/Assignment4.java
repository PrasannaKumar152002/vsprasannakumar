package Week6;

public class Assignment4 {
	public static void main(String[] args) {
		Coach b=new Coach();
		Boxer m1=new Boxer();
		Boxer m2=new Boxer();
		Boxer m3=new Boxer();
		m1.start();
		m2.start();
		m3.start();
	}
}
class Boxer extends Thread{
	Coach b=new Coach();
	@Override
	public void run() {
		PunchBag.hole(this);
		if(PunchBag.Punch==6000)
		{
			b.start();
		}
	}
}
class Coach extends Thread{
	@Override
	public void run() {
		PunchBag.getPunch();
	}
}
class PunchBag{
	static int Punch=0;
	static int sun=0;
	synchronized static void hole(Thread t1)
	{
		System.out.println(t1.currentThread());
		for(int i=0;i<2000;i++)
		{
			Punch++;
			sun++;
		}
		System.out.println(sun);
		sun=0;
		//int sun=Punch;
//		try {
//			t1.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	synchronized static void getPunch() {
		System.out.println("Final Sum : "+Punch);
	}
	
}