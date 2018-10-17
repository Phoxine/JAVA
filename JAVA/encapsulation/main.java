public class main
{
	public static void main(String[] args)  //program entry must be public and static
	{
		Product A = new Product();
		Product B = new Product();

		A.setName("lemon");
		A.setPrice(23.0f);

		B.setName("Waterlemon");
		B.setPrice(50.0f);

		A.print();
		A.name = "apple";
		System.out.println(A.name);	
		
		A.compare(B);
		B.compare(A);
	}

}
