package NewPack;

import java.util.Scanner;

public class Arithmetics_12_2 {
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	public int sub(int d, int e)
	{int f=d-e;
		return f;
		
	}
	public int mult(int g, int h)
	{int i=g*h;
		return i;
		
	}
	public void Div(float j, float k)
	{float l= j/k;
	System.out.println("Result" +l);
	}
	  public static void main(String[] args) {
		Arithmetics_12_2 obj=new Arithmetics_12_2();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value of x1");
		int x1=s.nextInt();
		System.out.println("enter the value of x2");
		int x2=s.nextInt();
		System.out.println("enter the value of x3");
		int x3=s.nextInt();
		System.out.println("enter the value of x4");
		int x4=s.nextInt();
		System.out.println("enter the value of x5");
		int x5=s.nextInt();
		System.out.println("enter the value of x6");
		int x6=s.nextInt();
		
		int i=obj.mult(x1, x2);
		int j= obj.sub(i,x3);
		int k= obj.sum(j, x4);
		int z= obj.sub(k, x5);
		obj.Div(z, x6);
		
		
			
	}
	}

