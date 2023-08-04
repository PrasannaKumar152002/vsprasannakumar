package Week3;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Fibanacci f=new Fibanacci();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(f.fib(n-2));
	}
}
class Fibanacci{
	static int sum=0;
	static int n1=0;
	static int n2=1;
	public int fib(int n)
	{
		if(n==0)
		{
			return sum;
		}
		//System.out.println(sum);
		sum=n1+n2;
		n1=n2;
		n2=sum;
		return fib(--n);
	}
}