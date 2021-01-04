package Chapter2;
/*
 * 传递对象
 */
public class PassAdress {
	int a=25,b=5;
	static void doPower(PassAdress p)
	{
		p.a+=5;
		p.b*=3;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassAdress p=new PassAdress();
		System.out.println("传递之前a和b的数值分别是："+p.a+","+p.b);
		doPower(p);
		System.out.println("传递之后a和b的数值分别是："+p.a+","+p.b);
		

	}

}
