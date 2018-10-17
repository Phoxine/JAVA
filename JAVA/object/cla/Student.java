package cla;

public class Student{
	public static int student_number=0;
	public int a;
	public double b = 20.0;
	
	public Student(int a){ 
		System.out.println("a Student object has been created!");
		this.a = a;
		student_number++;
	}
	//constructor
	public int getA(){
	       	return this.a;
	}
}
