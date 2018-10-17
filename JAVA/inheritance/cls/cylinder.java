package cls;

public class cylinder extends circle
{
	private int height;

	public cylinder()
	{
		super();
		height = 0;
	}

	public void setR(double radius)
	{
		super.setR(radius);
	}
	
	public void setH(int height)
	{
		this.height = height;
	}
	public void volume()
	{
		System.out.println(super.area() * height);
	}

		
}
