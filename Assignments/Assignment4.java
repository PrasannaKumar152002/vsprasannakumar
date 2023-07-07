package lab3;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		fun f=new fun();
		System.out.println("Fibonacci  			- press 1");
		System.out.println("Factorial              	  	- press 2");
		System.out.println("Sum of Digits          	  	- press 3");
		System.out.println("Palindrom        		- press 4");
		System.out.print("Enter the operation to be performed : ");
		int n=sc.nextInt();
		System.out.println("Enter the number : ");
		int d=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println(f.fact);
			f.fibanacci(d, 0);
			break;
		case 2:
			f.factorial(d);
			break;
		case 3:
			f.digits(d);
			break;
		case 4:
			f.str=d;
			f.palindrom(d);
			break;
	}
}
}
class fun{
	static int fact=1;
	static int sum=1,num=0;
	static int str;
	void factorial(int n)
	{
		if(n==0)
		{
			System.out.println("The factorial of the given number is "+fact);
			System.exit(0);
		}
		fact*=n;
		factorial(--n);
	}
	void fibanacci(int n,int i)
	{
		if(i==n)
		{
			System.exit(0);
		}
		System.out.println(sum);
		int temp=sum;
		sum+=fact;
		fact=temp;
		fibanacci(n,++i);
	}
	void digits(int n)
	{
		if(n==0)
		{
			System.out.println(num);
			System.exit(0);
		}
		num+=(n%10);
		digits(n/10);
	}
	void palindrom(int n)
	{
		if(n==0)
		{
			if(num==str)
			{
				System.out.println("The given string is palindrom");
			}
			else {
				System.out.println("The given string is not palindrom ");
			}
			System.exit(0);
		}
		num+=((n%10)*(Math.pow(10, Integer.toString(n).length()-1)));
		palindrom(n/10);
	}
	
}

