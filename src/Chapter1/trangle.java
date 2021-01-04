package Chapter1;
import java.util.Scanner;
/*
 * 三角形边长的判定
 */
public class trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input the length of trangle: ");
		
		Scanner ain =new Scanner(System.in);
		int a=ain.nextInt();
		Scanner bin =new Scanner(System.in);
		int b=bin.nextInt();
		Scanner cin =new Scanner(System.in);
		int c=cin.nextInt();
		if(a+b>c)
			System.out.println("ok");
		else
			System.out.println("no");
		

	}

}
