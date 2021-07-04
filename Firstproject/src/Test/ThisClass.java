package Test;

public class ThisClass
{
	public ThisClass() {
		this(1, 2, 3);
		
		System.out.println("Default Constructor");// TODO Auto-generated constructor stub
	}
	public ThisClass(int a) {
		this();
		
		System.out.println("One Constructor");// TODO Auto-generated constructor stub
	}
	public ThisClass(int a, int b) {
		this(1,2, 3, 4);
		System.out.println("Two Constructor");// TODO Auto-generated constructor stub
	}
	public ThisClass(int a, int b, int c) {
		
		System.out.println("Three Constructor");// TODO Auto-generated constructor stub
	}
	
	public ThisClass(int a, int b, int c, int d) {
		this(1);
		System.out.println("Four Constructor");// TODO Auto-generated constructor stub
	}
	   
	public static void main(String[] args) {
		ThisClass cons= new ThisClass(1,2);
				
	}

	
}
