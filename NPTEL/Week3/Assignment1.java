package Week3;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		Point p1=new Point();
		Point p2=new Point();
		p1.x=sc.nextDouble();
		p1.y=sc.nextDouble();
		p2.x=sc.nextDouble();
		p2.y=sc.nextDouble();
		System.out.printf(String.format("%.2f", Point.distance(p1,p2)));
	}
}
class Point{
	double x;
	double y;
	public static double distance(Point p1,Point p2)
	{
		double dt=Math.sqrt((Math.pow((p2.x-p1.x), 2)+Math.pow((p2.y-p1.y),2)));
		return dt;
		
	}
}