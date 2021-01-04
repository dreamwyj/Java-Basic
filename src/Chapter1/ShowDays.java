package Chapter1;
/*
 * 输出某年某个月的天数
 */
import java.util.Scanner;
public class ShowDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,month=0,day=0;
		System.out.println("Please input year : ");
		Scanner inyear=new Scanner(System.in);
		System.out.println("Please input month : ");
		Scanner inmonth=new Scanner(System.in);
		
		if(inyear.hasNextInt())
		{
			year=inyear.nextInt();
		}
		if(inmonth.hasNextInt())
		{
			month=inmonth.nextInt();
		}
		switch(month) {
		case 1:;
		case 3:;
		case 5:;
		case 7:;
		case 8:;
		case 10:;
		case 12:day=31;break;
		case 4:;
		case 6:;
		case 9:;
		case 11:day=30;break;
		case 2:if(year%400==0||(year%4==0&&year%100!=0))
			day=28;
		else
			day=29;
		break;
		}
		System.out.println("There ares "+day+" days");
	}

}
