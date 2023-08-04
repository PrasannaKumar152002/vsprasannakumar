package Week3;

import java.util.Scanner;

public class Assigment3 {
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Question q=new Question();
		swap(q);
	}
	static void swap(Question q)
	{
		System.out.println("Before Swapping : a="+q.a+" b="+q.b);
		int temp=q.a;
		q.a=q.b;
		q.b=temp;
		System.out.println("After Swapping : a="+q.a+" b="+q.b);
	}
}
class Question{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
}