package Chapter2;
/*
 * 传递基本数据类型的参数时，编译器将参数的值传递到方法中，
 * 在方法中修改过来的参数的值，并不会影响原参数的值
 */
public class PassValue {
	static void doPower(int i,int j)
	{
		i+=5;
		j*=3;
		System.out.println("传递之后i和j的数值分别是："+i+","+j);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25,b=5;
		System.out.println("传递之前a和b的数值分别是："+a+","+b);
		doPower(a,b);
		System.out.println("传递之后a和b的数值分别是："+a+","+b);
		

	}

}
