package Test;

public class ChildMethod extends ParentMethod {
	
		public void cm() {
			

		System.out.println("Default child method");
	
	}
		public void cm1( int a) {
			System.out.println("1 para child mehod");
			
		}	
		public void cm2( int a, int b) {
			System.out.println("2 para child mehod");
			
		}
		public void cm3( int a, int b, int c) {
			super.m();
			System.out.println("3 para child mehod");
			this.cm();
			this.cm2(1,1);
			this.cm1(1);
			this.cm4(1, 1, 1, 1);
			
	
			
		}
		public void cm4(int a, int b, int c, int d) {
			System.out.println("4 para child mehod");
		}

		public static void main(String[] args) {
			ChildMethod ob= new ChildMethod();
			ob.cm3(1,1,1);
			
		
		}
}
