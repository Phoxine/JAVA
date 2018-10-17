package cls;

public class circle
{
	public static double PI = 3.14159;
	public double radius;
	
	public circle()
	{
		radius = 0;
	}
	public double getR()
	{
		return radius;
	}

	public void setR(double radius)
	{
		this.radius = radius;
	}
	public double area(){
		return radius * radius * PI;
	}
}
