package Chapter2;

import java.util.Scanner;

public class Computer {
	private static double x;
	private static double y;
	Computer(double x,double y)
	{
		this.x=x;
		this.y=y;
		
	}
	void add()
	{
		System.out.println("x+y="+(x+y));
	}

	void sub()
	{
		System.out.println("x-y="+(x-y));
	}
	void mul()
	{
		System.out.println("x*y="+x*y);
	}
	void div()
	{
		System.out.println("x/y="+x/y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数字:");
		
		Scanner ain=new Scanner(System.in);
		double a=ain.nextDouble();
		System.out.println("请输入另一个数字:");
		Scanner bin=new Scanner(System.in);
		double b=bin.nextDouble();
		Computer computer =new Computer(a,b);
		computer.add();
		computer.sub();
		computer.mul();
		computer.div();
		

	}

}
