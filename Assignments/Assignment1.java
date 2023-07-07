package lab3;
import java.util.*;
public class Assignment1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------Calculator---------------");
		functions f=new functions();
		try {
			System.out.println("Addition                - press 1");
			System.out.println("Subtraction             - press 2");
			System.out.println("Multliplication         - press 3");
			System.out.println("Division                - press 4");
			System.out.println("Power Calculation       - press 5");
			System.out.println("Squareroot Calculation	- press 6");
			System.out.println("Modulus               	- press 7");
			System.out.println("factorial				- press 8");
			System.out.print("Enter the operaion to be Performed : ");
			int n=sc.nextInt();
			if(n==8||n==6)
			{
				System.out.println("Enter the number : ");
				double d=sc.nextDouble();
				if(n==8)
				{
					f.fact(d);
				}
				else {
					f.sqrt(d);
				}
			}
			else if(n>8||n<1)
			{
				System.out.println("press the right number form the given operation of your choice ");
			}
			else {
				System.out.println("Enter any two number : ");
				double n1=sc.nextDouble();
				double n2=sc.nextDouble();
				switch(n)
				{
				case 1:
					f.add(n1,n2);
					break;
				case 2:
					f.sub(n1,n2);
					break;
				case 3:
					f.mul(n1,n2);
					break;
				case 4:
					f.div(n1,n2);
					break;
				case 5:
					f.pow(n1,n2);
					break;
				case 7:
					f.mod(n1,n2);
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("The value you have entered is not a number");
		}
	}
}
class functions{
	void add(double n1, double n2)
	{
		System.out.println("The sum is "+(n1+n2));
	}
	void sub(double n1, double n2)
	{
		System.out.println("The difference is "+(n1-n2));
	}
	void mul(double n1, double n2)
	{
		System.out.println("The product is "+(n1*n2));
	}
	void div(double n1, double n2)
	{
		System.out.println("The quotient is "+(n1/n2));
	}
	void pow(double n1, double n2)
	{
		System.out.println("The power product is "+Math.pow(n1,n2));
	}
	void sqrt(double n1)
	{
		System.out.println("The squareroot is "+Math.sqrt(n1));
	}
	void mod(double n1, double n2)
	{
		System.out.println("The modulus is "+(n1%n2));
	}
	void fact(double n1)
	{
		double mul=1;
		while(n1>0)
		{
			mul*=n1;
			n1--;
		}
		System.out.println("The factorial is "+mul);
	}
}
