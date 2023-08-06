package Week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int n=sc.nextInt();
		int sum=0;
		int []arr=new int[n];
		System.out.println("Enter the elements : ");
		try {
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			System.out.println("Sum of the array elements is "+sum);
		}catch(InputMismatchException ie){System.out.println("You entered bad data");}
	}
}
