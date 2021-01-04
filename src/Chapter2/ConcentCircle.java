package Chapter2;
/*
 * 静态变量，内存变量，多个对象共享一个内存，只存储一个版本
 */
public class ConcentCircle {
	public static int x=100,y=100;
	public int r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcentCircle t1=new ConcentCircle();
		ConcentCircle t2=new ConcentCircle();
		t1.x+=100;
		t1.r=50;
		t2.x+=200;
		t2.r=150;
		System.out.println("Circle1:x="+t1.x+",y="+t1.y+",r="+t1.r);
		System.out.println("Circle2:x="+t2.x+",y="+t2.y+",r="+t2.r);

	}

}
