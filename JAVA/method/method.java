public class method{
	public static void main(String[] args){
		int number = 9;
		String a = "Hello World!";
		System.out.println(square(number));
		print(a);
	}

	public static int square(int input){
		return input * input;
	}
	
	public static void print(String name){
		System.out.println(name);
	}
}
