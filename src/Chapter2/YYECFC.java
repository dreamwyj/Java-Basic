package Chapter2;
import java.lang.Math;
import java.util.Scanner;
public class YYECFC {
	double x1,x2;
	private double a,b,c;
	public YYECFC(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	void real_root(double delt)
	{
		System.out.println("方程的实根为：");
		if(delt>0)
		{
			x1=(-b+Math.sqrt(delt))/(2*a);
			x2=(-b-Math.sqrt(delt))/(2*a);
			System.out.println("x1="+x1+", x2="+x2);
		}
		else
		{
			x1=-b/(2*a);
			//x2=x1;
			System.out.println("x1=x2"+x1);
		}
	}
	void virtual_root(double delt)
	{
		System.out.println("方程的虚根为：");
		double real,imag;
		if(delt<0)
		{
			real=-b/(2*a);
			imag=Math.sqrt(-delt)/(2*a);
			System.out.println("x1="+real+"+"+imag+"i,"+"x2="+real+"-"+imag+"i");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("请输入方程式a,b,c的值：");
		Scanner ain=new Scanner(System.in);
		a=ain.nextInt();
		Scanner bin=new Scanner(System.in);
		b=bin.nextInt();
		Scanner cin=new Scanner(System.in);
		c=cin.nextInt();
		double delt=b*b-4*a*c;
		YYECFC answer=new YYECFC(a,b,c);
		if(delt>=0)
			answer.real_root(delt);
		else
			answer.virtual_root(delt);
			
		

	}

}
