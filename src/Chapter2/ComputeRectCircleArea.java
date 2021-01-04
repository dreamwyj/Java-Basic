package Chapter2;
/*
 * 构造方法中运用重载
 */
class RectCircleConstructor{
	final double PI=3.14;
	double length;
	double width;
	double radius;
	double rectarea() {
		return length*width;
	}
	double circlearea() {
		return PI*radius*radius;
	}
	RectCircleConstructor(double width,double length){
		this.width=width;
		this.length=length;
		
	}
	RectCircleConstructor(double radius)
	{
		this.radius=radius;
	}
}

public class ComputeRectCircleArea {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectCircleConstructor rect = new RectCircleConstructor(10,20);
		RectCircleConstructor circle=new RectCircleConstructor(6);
		System.out.println("长方形的面积是"+rect.rectarea());
		System.out.println("圆的面积是"+circle.circlearea());

	}

}
