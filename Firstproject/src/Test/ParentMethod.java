package Test;

public class ParentMethod {
	public void m() {
	System.out.println("Default parent method");
	this.m1(1);
	this.m3(1, 1, 1);
	this.m2(1, 1);
	this.m4(1, 1, 1, 1);
	
	
	} 
	public void m1( int a) {
		System.out.println("1 para parent mehod");
		
	}	
	public void m2( int a, int b) {
		System.out.println("2 para parent mehod");
		
	}
	public void m3( int a, int b, int c) {
		System.out.println("3 para parent mehod");
	
		
	}

	public void m4(int a, int b, int c, int d) {
		System.out.println("4 para parent mehod");
		
	}

}
