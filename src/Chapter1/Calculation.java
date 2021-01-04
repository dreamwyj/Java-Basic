package Chapter1;
/*完成两个整数的相加与相减
 * 1.一个Java文件最多只能有一个公共类
 * 2.构造方法完成对实例变量的初始化
 * 3.类方法对实例变量进行操作
 * 4.调用实例的方法才会执行该所属类的方法
 */
class Add{
	int x,y;
	//构造方法
	Add(int num1,int num2){
		x=num1;
		y=num2;
		
	}
	//定义方法
	int getSum() {
		return x+y;
	}
	
}
class Sub{
	int x,y;
	//构造方法
	Sub(int num1,int num2){
		x=num1;
		y=num2;
	}
	int getSub() {
		return x-y;
	}
	
}


public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add=new Add(2,3);
		System.out.println(add.x+"+"+add.y+"="+add.getSum());
		Sub sub=new Sub(8,4);
		System.out.println(sub.x+"-"+sub.y+"="+sub.getSub());

	}

}
