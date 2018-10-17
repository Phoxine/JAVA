

public class number
{
	private int number;

	public number()
	{
		number=0;
	}

	public void setNumber(long number)
	{
		this.number = (int)number;
	}
	public void print()
	{
		System.out.println("from class number " + number);
	}

}
