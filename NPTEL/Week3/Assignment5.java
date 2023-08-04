package Week3;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Create an object to read     
		double l=sc.nextDouble(); //Read length 
		  double b=sc.nextDouble(); //Read breadth   
		  double h=sc.nextDouble(); //Read height 
		  //Shape myshape1 = new Shape(l,h); 
		  Shape myshape2 = new Test1(l,b); 
		  Shape myshape3 = new Test1(l,b,h); 
		  //double volume1; 
		  //double volume2; 
		  //volume1 = myshape1.calculate(); 
		  //volume2=myshape2.calculate(); 
		  //System.out.println(volume1); 
		  //System.out.println(volume2);
		  System.out.println(myshape2.calculate()+" 2 parameter");
		  System.out.println(myshape3.calculate()+" 3 parameter");
	}
}
class Shape{
	double length,breath;
	public Shape(double l,double b) {
		length=l;
		breath=b;
	}
	public Shape(double len)
	{
		length=breath=len;
	}
	double calculate()
	{
		System.out.println("Length and Breadth same");
		return length*breath;
	}
	
}
class Test1 extends Shape{
	double height;
	public Test1(double len,double h) {
		super(len);
		height=h;
	}
	public Test1(double l,double b,double h) {
		super(l,b);
		height=h;
	}
	double calculate()
	{
		return length*breath*height;
		
	}
	
}
