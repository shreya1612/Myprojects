package Test;

public class Met {
public void m() {
	
	System.out.println("default method");
	this.m4(1,1,1,1);
    this.m1(1);
    this.m3(1,1,1);
    this.m2(1, 1);
}
public void m1(int a) {
	System.out.println("1 parameterized method");
	
}
public void m2(int a, int b) {
	
	System.out.println("2 parameterized method");
    
    
    
}

public void m3(int a, int b, int c ) {
	System.out.println("3 parameterized method");
}

public void m4(int a, int b,int c, int d) {
	System.out.println("4 parameterized method");
	
}
public static void main(String[] args) {
	Met ob= new Met();
	ob.m();

			
}

}
