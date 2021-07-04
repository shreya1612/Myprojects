package Test;

public class Student {
	int age=25;
	int rollno= 95;
	public void display1()
	{
		System.out.println("Welcome all");
		
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
		
	}
	public static void main(String[] e)
	{
		Student shr = new Student();
		System.out.println(shr.age);
		System.out.println(shr.rollno);
		shr.display1();
		shr.display2();
			
		
	}
}