import cls.*;

public class main
{
	public static void main(String[] args)
	{
		circle A = new circle();	
		cylinder B = new cylinder();
		A.setR(10.0);
		System.out.println(A.radius);
		System.out.println(A.area());
		B.setR(20.0);
		System.out.println(B.radius);
		B.setH(10);
		B.volume();
		int b = (int)A.getR();
		System.out.println(b);
	}

}
