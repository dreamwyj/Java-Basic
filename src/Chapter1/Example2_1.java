package Chapter1;
import java.util.Scanner;

public class Example2_1 {
	public static void main(String[] args) {
		int x,y,z;
		System.out.println("请输入两个整数：");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();//转换为整数类型
		y=in.nextInt();
		z=x+y;
		System.out.println(x+"+"+y+"="+z);
		
	}

}
