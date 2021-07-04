package Test;

public class Child extends Parent
{
public Child() {
	super(1, 1);
	System.out.println("Default child constructor");// TODO Auto-generated constructor stub
	
}
public Child(int a) {
this(1, 1, 1);

	System.out.println("1 Para Child constructor");// TODO Auto-generated constructor stub
}
public Child(int a, int b) {
	this(1, 1, 1, 1);
	System.out.println("2 para Child constructor");// TODO Auto-generated constructor stub
}
public Child(int a, int b, int c ) {
	this();
	System.out.println("3 para Child constructor");// TODO Auto-generated constructor stub
}
public Child(int a, int b, int c, int d) {
	this(1);
	System.out.println("4 para Child constructor");// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	Child ob= new Child(1,1);
			
}
}
