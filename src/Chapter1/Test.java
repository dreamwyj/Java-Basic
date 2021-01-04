package Chapter1;
/*
 * 1.this 当形参与实例变量相同时，用其代表实例变量
 */
public class Test {
	String name,addr,tele;
	Test(String name,String addr,String tele){
		this.name=name;
		this.addr=addr;
		this.tele=tele;
	}
	void Write_Sugestion() {
		System.out.print("姓名:"+name+"\n"+"地址:"+addr+"\n"+"电话:"+tele+"\n");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test person =new Test("张三","武汉江汉路","18978928989");
		person.Write_Sugestion();

	}

}
