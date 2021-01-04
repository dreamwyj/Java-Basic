package Chapter2;
/* 1.类方法只能访问类变量
 * 2.实例方法既可以访问类变量，也可以访问实例变量
 * 3.可以直接通过类名调用类方法，不能调用实例方法
 * 4.对象名既可以调用类方法，也可以调用实例方法
 * 
 */
public class StaticDemo {
	private int x;
	private static int y; 
	public static void setXY1(int newX,int newY) {//声明类方法
	//	x=newX; 类方法只能访问类变量
		y=newY;
	}
	public void setXY2(int newX,int newY) {//声明实例方法
		x=newX;
		y=newY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo t1=new StaticDemo();
		StaticDemo.setXY1(10, 20);
	//	StaticDemo.setXY2(10,30); 不能直接引用类的实例方法
		t1.setXY1(1, 18);
		t1.setXY2(9, 28);
		

	}

}
