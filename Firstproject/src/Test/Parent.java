package Test;

public class Parent {

	public Parent() {
		this(1, 1, 1);
		
		System.out.println("Default Parent constructor");// TODO Auto-generated constructor stub
	}
	public Parent(int a) {
		this();
		System.out.println("1 Para Parent constructor");// TODO Auto-generated constructor stub
	}
	public Parent(int a, int b) {
		this(1, 1, 1, 1);
		System.out.println("2 para Parent constructor");// TODO Auto-generated constructor stub
	}
	public Parent(int a, int b, int c ) {
		System.out.println("3 para Parent constructor");// TODO Auto-generated constructor stub
	}
	public Parent(int a, int b, int c, int d) {
		this(1);
		System.out.println("4 para Parent constructor");// TODO Auto-generated constructor stub
	}
	
	
}
