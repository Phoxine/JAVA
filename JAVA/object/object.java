import cla.*;


public class object{
	public static void main(String[] args){
		System.out.println(Student.student_number);
		Student tom = new Student(10);
		System.out.println(tom.getA() + " " + tom.b );
		System.out.println(Student.student_number);

	}
}
