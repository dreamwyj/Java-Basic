package Chapter1;
import java.lang.Math.*;
/*
 * 输出前30个素数
 */
public class PrimeNumber {
	static final int NUM=30;
	static final int PERLINE=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int nature=2;
		while(num<NUM)//自然数
		{
			//System.out.println("检验"+nature);
			boolean flag=true;//判断
			for(int i=2;i<=Math.sqrt(nature);i++)//判断
			{
				if(nature%i==0&&nature!=i)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				
				num++;
				if(num%PERLINE==0)
					System.out.println(nature);
				else
					System.out.print(nature+" ");
			}
			nature++;
		}
	}
}
