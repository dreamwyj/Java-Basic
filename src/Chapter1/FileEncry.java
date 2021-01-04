package Chapter1;
import java.util.Scanner;
/*实现加密，解密案例
 * 1.输入一个字符串
 * 2.将字符串转换为字符数组
 * 3.将其与一个字符异或运算
 * 4.输出加密字符串，解密字符串
 * 
 * 用static修饰的成员变量为类变量，不同对象共享一个类变量，系统只为它分配一次内存
 */

public class FileEncry {
	static char secretChars[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入加密的内容:");
		Scanner in=new Scanner(System.in);
		String secretStr=in.nextLine();
		secretChars=secretStr.toCharArray();
		
		System.out.print("密文:");
		
		FileEncry Encode=new FileEncry();
		Encode.Encry();
		System.out.print("\n明文:");
		FileEncry Decode=new FileEncry();
		Decode.Encry();
		
	}
	private static void Encry(){
		
		char secret='x';
		for(int i=0;i<secretChars.length;i++)
		{
			secretChars[i]=(char)(secretChars[i]^secret);
			System.out.print(secretChars[i]);
		}
	}
}
		
		
		
		

	


