package Chapter1;
import java.util.Scanner;
/*计算税款
 * if-else语句
 * hasNextInt()
 * NextInt()
 */
public class ComputerTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int status=0;//纳税人的身份
		double income=0.0;//纳税人收入
		double tax=0;

		System.out.println("Please enter the type of taxpayer: 0-single, 1-married, 2-family");
		Scanner inStatus =new Scanner(System.in);
		//方法hasnextInt()判断扫描器的输入内容是否可以解释为一个int数据类型
		
		if(inStatus.hasNextInt())
		{
			// 方法nextInt()将输入信息扫描为一个int数据类型
			status=inStatus.nextInt();
		}
		
		System.out.println("Please enter your income:");
		Scanner in =new Scanner(System.in);
		if(in.hasNextDouble())
		{
			income=in.nextDouble();
		}
		//income=in.nextInt();
		if(status==0) {
			if(income<6000)
				tax=income*0.1;
			else if(income<=27950)
				tax=6000*0.1+(income-6000)*0.15;
			else if(income<=67700)
				tax=6000*0.1+(27950-6000)*0.15+(income-27950)*0.27;
			else if(income<=141250)
				tax=6000*0.1+(27950-6000)*0.15+(67700-27950)*0.27+(income-67700)*0.30;
			else
				tax=6000*0.1+(27950-6000)*0.15+(67700-27950)*0.27+(141259-67700)*0.30+(income-141250)*0.35;
		}
		else if(status==1) {
			if(income<=12000)
				tax=income*0.1;
			else if(income<=467700)
				tax=12000*0.1+(income-12000)*0.15;
			else if(income<=112850)
				tax=12000*0.1+(46700-12000)*0.15+(income-46700)*0.27;
			else if(income<=171950)
				tax=6000*0.1+(46700-12000)*0.15+(171950-467700)*0.27+(income-112850)*0.30;
			else
				tax=6000*0.1+(46700-12000)*0.15+(171950-467700)*0.27+(171950-112850)*0.30+(income-171950)*0.35;
			
		}
		else if(status==2)
		{
			if(income<=10000)
				tax=income*0.1;
			else if(income<=37450)
				tax=10000*0.1+(income-10000)*0.15;
			else if(income<=96700)
				tax=10000*0.1+(27450-10000)*0.15+(income-37450)*0.27;
			else if(income<=156600)
				tax=10000*0.1+(27450-10000)*0.15+(96700-37450)*0.27+(income-96700)*0.30;
			else
				tax=10000*0.1+(27450-10000)*0.15+(96700-27450)*0.27+(141250-96700)*0.30+(income-171950)*0.35;
		}
		System.out.println("The tax you have to pay is: "+tax);

	}

}
