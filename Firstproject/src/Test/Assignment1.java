package Test;

public class Assignment1 {
	public int sum(int s1,int s2)
	{ int s3;
       s3=s1+s2;
	System.out.println("Sum_Result "+s3);
		return s3;
	}
	public int sub(int a1, int a2)
	{int a3;
        a3= a1-a2;
	System.out.println("Result of sub "+a3);
		return a3;
	}
	public int mul(int m1, int m2)
	{int m3;
        m3= m1*m2;
	System.out.println("Result of mul "+m3);
		return m3;
	}
	public int div(int d1, int d2)
	{int d3;
        d3= d1/d2;
	System.out.println("Result of div "+d3);
		return d3;
	}
	public static void main(String[] e)
	{
		Assignment1 ob= new Assignment1();
		int Sum_Result =ob.sum(10, 2);
		int Sum_Total=ob.sum(Sum_Result, 2);
		int Sub_Result=ob.sub(Sum_Total, 2);
		int Mul_Result=ob.mul(Sub_Result, 2);
		int Result=ob.div(Mul_Result, 2);
		System.out.println("Final=\t" +Result);
		
	}
	
}
	
