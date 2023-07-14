package lab4;

public class ClassandObject {
	public static void main(String[] args) {
		Person ps=new Person();
		ps.call();
		System.out.println();
		System.out.println("----------------Lab 3: Inheritance and Polymorphism ----------------");
		System.out.println();
		Employees e=new Employees();
		e.setEmployeeId(101);
		e.setSalary(5000000);
		System.out.println("Employee ID : "+e.getEmployeeId());
		System.out.println("Salary 	    : "+e.getSalary());
		System.out.println();
		System.out.println("----------------Lab 4: Static Members and Methods----------------");
		System.out.println();
		System.out.println("Number of Object Created 	    : "+e.getCount());
		System.out.println();
		System.out.println("----------------Lab 5: Encapsulation and Access Modifiers----------------");
		System.out.println();
		BankAccount b=new BankAccount();
		b.setAccountNo(1234);
		b.setBalance(4000000);
		b.setName(e.getName());
		System.out.println("AccountNo	: "+b.getAccountNo());
		System.out.println("Name		: "+b.getName());
		System.out.println("Balance		: "+b.getBalance());
		System.out.println();
		System.out.println("----------------Lab 6: Method Overriding and Abstract Classes----------------");
		System.out.println();
		rectangle r=new rectangle(50,20);
		System.out.println("Area of rectange : "+r.CalculateArea());
		circle c=new circle(4);
		System.out.println("Area of circle 	 : "+c.CalculateArea());
		System.out.println();
		System.out.println("----------------Lab 7: Interfaces----------------");
		System.out.println();
		Playable p=new Guitar();
		p.play();
		p=new piano();
		p.play();
		System.out.println();
		System.out.println("----------------Lab 8: Wrapper Classes and Autoboxing----------------");
		System.out.println();
		WrapperClass wc=new WrapperClass();
		wc.m1();
		System.out.println();
		System.out.println("----------------Lab 9: String Handling----------------");
		System.out.println();
		StringHandling sh=new StringHandling();
		sh.Hand();
		System.out.println();
		System.out.println("----------------Lab 10: Exception Handling----------------");
		System.out.println();
		ExceptionHandling ex=new ExceptionHandling();
		ex.test(0);
		ex.test(1);
	}
	
}
