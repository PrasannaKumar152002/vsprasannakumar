package lab3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String []args)
	{
		details d=new details();
		d.service();
	}
}
class details{
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Database> db=new HashMap<Integer,Database>();
	Database ds=new Database(101,"Prasanna S",21,"Software Developer",6000000);
	Database ds1=new Database(102,"Prashant S",24,"Software Developer",5500000);
	Database ds2=new Database(103,"KamalRaj B",23,"Software Engineer",4000000);
	Database ds3=new Database(104,"Karthic K",20,"Software Engineer",4500000);
	Database ds4=new Database(105,"Ganaesh G",21,"Network Engineer",3000000);
	Methods m=new Methods();
	
	public void service()
	{
		db.put(ds.ID,ds);
		db.put(ds1.ID,ds1);
		db.put(ds2.ID,ds2);
		db.put(ds3.ID,ds3);
		db.put(ds4.ID,ds4);
		System.out.println("Add new Employee                - press 1");
		System.out.println("Delete an Employee              - press 2");
		System.out.println("Update an Employee          	- press 3");
		System.out.println("Search an Enmployee             - press 4");
		System.out.println("Display all Enmployee           - press 5");
		System.out.print("Enter your service : ");
		int n=sc.nextInt();
		try {
		switch(n)
		{
		case 1:
			m.New(db);
			break;
		case 2:
			m.Delete(db);
			break;
		case 3:
			m.Update(db);
			break;
		case 4:
			m.Search(db);
			break;
		case 5:
			m.display(db);
			break;
		}
		}
		catch(Exception e)
		{
			System.out.println("Enter the right Choice ");
			service();
		}
		
	}
}
class Database{
	int ID;
	String Name;
	int age;
	String Designation;
	int Salary;
	public Database(int id, String Name, int age, String Designation, int Salary){
		this.ID=id;
		this.Name=Name;
		this.age=age;
		this.Designation=Designation;
		this.Salary=Salary;
	}
}
class Methods{
	Scanner sc=new Scanner(System.in);
	int flag=0;
	public void New(HashMap<Integer,Database> dk) {
		int id,age,Salary;
		String Name,Designation;
		System.out.println("Enter the Employee Details");
		System.out.print("Enter the Employee ID    	  : ");
		id=sc.nextInt();
		for(Entry<Integer, Database> dt:dk.entrySet())
		{
			if(dt.getKey()==id)
			{
				System.out.println("The account number aldready exist.Please enter a different account number");
				New(dk);
			}
		}
		System.out.println();
		System.out.print("Enter the Employee Name  	  : ");
		Name=sc.next();
		System.out.println();
		System.out.print("Enter the Employee Age   	  : ");
		age=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Employee Designtion : ");
		Designation=sc.next();
		System.out.println();
		System.out.print("Enter the Employee Salary 	  : ");
		Salary=sc.nextInt();
		System.out.println();
		Database ds=new Database(id, Name, age, Designation,Salary);
		dk.put(id,ds);
		System.out.println("Successfully Added");
		display(dk);
		
	}
	public static void display(HashMap<Integer,Database> dk)
	{
		System.out.println("     Id                 Name\t\t\tAge\t\tDesignation\t\t\tSalary");
		for(Entry<Integer, Database> dt:dk.entrySet())
		{
			//System.out.println(""+dt.getValue().ID+"\t\t\t"+dt.getValue().Name+"\t\t\t"+dt.getValue().age+"\t\t\t\t"+dt.getValue().Designation+"\t\t\t\t"+dt.getValue().Salary);
			System.out.println("     "+dt.getValue().ID+"                "+dt.getValue().Name+"\t\t"+dt.getValue().age+"\t\t"+dt.getValue().Designation+"\t\t"+dt.getValue().Salary);
		}
		
	}
	public void Delete(HashMap<Integer,Database> dk) {
		int id,age,Salary;
		String Name,Designation;
		System.out.print("Enter the Employee ID    	  : ");
		id=sc.nextInt();
		for(Entry<Integer, Database> dt:dk.entrySet())
		{
			if(dt.getKey()==id)
			{
				flag=1;
				dk.remove(id);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Employee id does't exit");
		}
		else {
			System.out.println("Successfully removed");
			display(dk);
		}
		
	}
	public void Search(HashMap<Integer,Database> dk) {
		int id,age,Salary;
		String Name,Designation;
		System.out.print("Enter the Employee ID    	  : ");
		id=sc.nextInt();
		try {
			
				System.out.println("ID  		 : "+dk.get(id).ID);
				System.out.println("Name  		 : "+dk.get(id).Name);
				System.out.println("Age  		 : "+dk.get(id).age);
				System.out.println("Designation  : "+dk.get(id).Designation);
				System.out.println("Salary  	 : "+dk.get(id).Salary);
		}
		catch(Exception e)
		{
			System.out.println("Employee id does't exit");
		}
		
	}
	public void Update(HashMap<Integer,Database> dk) {
		int id,age,Salary;
		String Name,Designation;
		System.out.print("Enter the Employee ID    	  : ");
		id=sc.nextInt();
		for(Entry<Integer, Database> dt:dk.entrySet())
		{
			if(dt.getKey()==id)
			{
				flag=1;
				System.out.println("What do you need to update : Name or age or designation or salary");
				String str=sc.next();
				switch(str) {
				case "Name":
					System.out.print("Enter the name : ");
					Name =sc.nextLine();
					age=dt.getValue().age;
					Salary=dt.getValue().Salary;
					Designation=dt.getValue().Designation;
					Database ds=new Database(id, Name, age, Designation,Salary);
					dk.put(id,ds);
					break;
				case "age":
					System.out.print("Enter the age : ");
					age =sc.nextInt();
					Name=dt.getValue().Name;
					Salary=dt.getValue().Salary;
					Designation=dt.getValue().Designation;
					Database ds1=new Database(id, Name, age, Designation,Salary);
					dk.put(id,ds1);
					break;
				case "designation":
					System.out.print("Enter the designation : ");
					Designation =sc.nextLine();
					age=dt.getValue().age;
					Salary=dt.getValue().Salary;
					Name=dt.getValue().Name;
					Database ds2=new Database(id, Name, age, Designation,Salary);
					dk.put(id,ds2);
					break;
				case "salary":
					System.out.print("Enter the salary : ");
					Salary =sc.nextInt();
					age=dt.getValue().age;
					Name=dt.getValue().Name;
					Designation=dt.getValue().Designation;
					Database ds3=new Database(id, Name, age, Designation,Salary);
					dk.put(id,ds3);
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Employee id does't exit");
		}
		else {
			System.out.println("Successfully updated");
			display(dk);
		}
		
	}
	
}
