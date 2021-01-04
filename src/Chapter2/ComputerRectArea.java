package Chapter2;
/*
 * 类的构造：基于类创建对象时向对象传递参数，类的成员变量进行初始化
 */
class RectConstructor{
	private double length;
	private double width;
	double area() {
		return length*width;
	}
	RectConstructor(double width,double length)
	{
		this.length=length;
		this.width=width;
		
	}
}

public class ComputerRectArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectConstructor rect1=new RectConstructor(10,20);
		
		RectConstructor rect2=new RectConstructor(3,6);
		double ar;
		ar=rect1.area();
		System.out.println("第一个长方形面积:"+ar);
		ar=rect2.area();
		System.out.println("第二个长方形面积:"+ar);
		

	}

}
