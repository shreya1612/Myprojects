package NewPack;

import java.util.Scanner;

public class Arthimetics {
public int sum(int a, int b)
{
	int c=a+b;
	System.out.println("Value of Sum="+c);
	return c;
	
}
public int sub(int d, int e)
{int f=d-e;
	System.out.println("Value of Sub="+f);
	return f;
	
}
public int mult(int g, int h)
{int i=g*h;
	System.out.println("Value of Mult="+i);
	return i;
	
	
}
public void Div(float j, float k)
{float l=  j/k;
	System.out.println("Value of Div/Result="+l);
	//return l;
	
}
  public static void main(String[] args) {
	  Arthimetics obj=new Arthimetics();
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
	
	int p=obj.mult(x1, x2);
	int q=obj.sum(p, x3);
	int r= obj.sum(q, x4);
	int t= obj.sub(r, x5);
	obj.Div(t, x6);
	
	
	
	
	
	  
	
}
}