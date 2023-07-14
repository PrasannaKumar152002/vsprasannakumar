package lab4;

public class Person {
	int age;
	int EmployeeId;
	int Salary;
	static int count=0;
	String name;
	String address;
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Person(Object address) {
		super();
		this.address = (String) address;
		age=21;
		name="Mr.Prasanna Kumar";
		count++;
	}
	public Person(String name) {
		super();
		this.name = name;
		age=21;
		address="67/11a, Thulukanam street,Thiruvottriyur, chennai-19";
		count++;
	}
	public Person(int age) {
		super();
		this.age = age;
		name="Mr.Prasanna Kumar";
		address="67/11a, Thulukanam street,Thiruvottriyur, chennai-19";
		count++;
	}
	public Person(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
		count++;
	}
	public Person() {
		age=21;
		name="Mr.Prasanna Kumar";
		address="67/11a, Thulukanam street,Thiruvottriyur, chennai-19";
		count++;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return (String) address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void call() {
		System.out.println();
		System.out.println("----------------Lab 1: Introduction to Classes and Objects----------------");
		System.out.println();
		Person cb=new Person();
		cb.setAge(22);
		cb.setAddress("65/43b, Nethaji Nagar,Ekatuthangal, chenai-57");
		cb.setName("Prakash. R");
		System.out.println("Name 	: "+cb.getName());
		System.out.println("Age  	: "+cb.getAge());
		System.out.println("Address : "+cb.getAddress());
		System.out.println();
		System.out.println("----------------Lab 2: Constructors and Overloading ----------------");
		System.out.println();
		Person cb5=new Person();
		System.out.println("Name 	: "+cb5.getName());
		System.out.println("Age  	: "+cb5.getAge());
		System.out.println("Address : "+cb5.getAddress());
		Person cb1=new Person(22,"Prakash. R","65/43b, Nethaji Nagar,Ekatuthangal, chenai-57");
		System.out.println("Name 	: "+cb1.getName());
		System.out.println("Age  	: "+cb1.getAge());
		System.out.println("Address : "+cb1.getAddress());
		Person cb2=new Person(22);
		System.out.println("Name 	: "+cb2.getName());
		System.out.println("Age  	: "+cb2.getAge());
		System.out.println("Address : "+cb2.getAddress());
		Person cb3=new Person((Object)"65/43b, Nethaji Nagar,Ekatuthangal, chenai-57");
		System.out.println("Name 	: "+cb3.getName());
		System.out.println("Age  	: "+cb3.getAge());
		System.out.println("Address : "+cb3.getAddress());
		Person cb4=new Person("Prakash. R");
		System.out.println("Name 	: "+cb4.getName());
		System.out.println("Age  	: "+cb4.getAge());
		System.out.println("Address : "+cb4.getAddress());
		System.out.println();
	}
	
}

