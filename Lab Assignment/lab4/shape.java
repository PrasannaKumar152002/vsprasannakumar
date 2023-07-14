package lab4;

public abstract class shape {
	int length;
	int breath;
	int radius;
	public shape()
	{
		length=10;
		breath=5;
		radius=6;
	}
	public shape(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	public shape(int radius)
	{
		this.radius=radius;
	}
	abstract int CalculateArea();
}
class rectangle extends shape{
	public rectangle(int length,int breath)
	{
		super(length,breath);
	}
	public rectangle()
	{
		super();
	}
	@Override
	int CalculateArea() {
		int area=length*breath;
		return area;
	}
	
}
class circle extends shape{
	public circle(int radius)
	{
		super(radius);
	}
	public circle()
	{
		super();
	}
	@Override
	int CalculateArea() {
		int area=(int) (3.14*(Math.pow(radius,2)));
		return area;
	}
	
}
