package Chapter2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LoanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double interestrate,loanvalue;
		int loanperiod;
		Scanner in =new Scanner(System.in);
		System.out.println("请输入贷款年利率：");
		interestrate=in.nextDouble();
		System.out.println("请输入贷款年限：");
		loanperiod=in.nextInt();
		System.out.println("请输入贷款总额：");
		loanvalue=in.nextInt();
		Loan loan=new Loan(interestrate,loanperiod,loanvalue);
		DecimalFormat df =new DecimalFormat("#.00");
		System.out.println("等额本息情况下的月均还款额为："+df.format(loan.getMonthlyPayment())+"$");
		System.out.println("贷款"+loanperiod+"年的总还款额为："+df.format(loan.getTotalPayment())+"$");
		
		
		

	}

}
