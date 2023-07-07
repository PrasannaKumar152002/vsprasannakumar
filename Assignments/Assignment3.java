package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int []arr= new int[6];
		System.out.println("Enter any 6 Intgeres");
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Transverse and Display  	- press 1");
		System.out.println("Sum              	  	- press 2");
		System.out.println("Search          	  	- press 3");
		System.out.println("Maximum              		- press 4");
		System.out.println("Minimum           	 	- press 5");
		System.out.println("Average           	 	- press 6");
		System.out.println("Index           	 	- press 7");
		System.out.println("Sorting           	 	- press 8");
		System.out.println("Enter the operation to be performed : ");
		int n=sc.nextInt();
		try {
		switch(n)
		{
		case 1:
			display(arr);
			break;
		case 2:
			sum(arr);
			break;
		case 3:
			System.out.print("Enter the number to be searched : ");
			int s=sc.nextInt();
			search(arr,s);
			break;
		case 4:
			maximum(arr);
			break;
		case 5:
			minimum(arr);
			break;
		case 6:
			Average(arr);
			break;
		case 7:
			System.out.print("Enter the index to be updated : ");
			int s1=sc.nextInt();
			index(arr,s1);
			break;
		case 8:
			sorting(arr);
			break;
		}
		}
		catch(Exception e)
		{
			System.out.println("Enter the right choice");
		}
	}
	static void display(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void sum(int []arr)
	{
		int sum=0;
		for(int s:arr) {sum+=s;}
		System.out.println("The sum is "+sum);
	}
	static void Average(int []arr)
	{
		int sum=0;
		float average;
		for(int s:arr) {sum+=s;}
		System.out.println("The average is "+sum/((float)arr.length));
	}
	static void search(int []arr,int s)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==s)
			{
				System.out.println("The given element "+s+" is in the index "+i);
				System.exit(0);
			}
		}
		System.out.println("The given element is not in the array");
	}
	static void maximum(int []arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			break;
		}
		System.out.println("The Maximum element in the array is "+max);
	}
	static void minimum(int []arr)
	{
		Arrays.sort(arr);
		System.out.println("The Minimum element in the array is "+arr[0]);
	}
	static void sorting(int []arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		display(arr);
	}
	static void index(int []arr,int in)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i==in)
			{
				System.out.print("Enter the number to be updated : ");
				int n=sc.nextInt();
				arr[i]=n;
				display(arr);
				System.exit(0);
			}
		}
		System.out.println("The index was out of range");
	}
}
