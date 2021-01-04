package Chapter2;
/*
 * 递归
 */
public class Fibonacci {
	public static long fib_1(int n)
	{
		if(n==0||n==1)
			return n;
		
		else
			return fib_1(n-1)+fib_1(n-2);
	}

	public static long fib_2(int n)
	{
		long f1=0,f2=1;
		long sum=0;
		if(n==0||n==1)
			return n;
		for(int j=1;j<n;j++)
		{
			sum=f1+f2;
			f1=f2;
			f2=sum;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("递归实现：");
		
		for(int i=1;i<10;i++)
		{
			
			System.out.print(fib_1(i)+" ");
			
		}
		System.out.println("\n循环实现：");
		
		for(int i=1;i<10;i++)
		{
			
			System.out.print(fib_2(i)+" ");
			
		}
		
		

	}

}
