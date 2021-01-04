package Chapter2;

public class Loan {
	private double monthlyInterestRate;// 贷款月利率
	private int numberOfMonths;// 贷款总月数
	private double loanAmount;// 贷款额
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount)
	{
		this.monthlyInterestRate=annualInterestRate/100/12;
		this.numberOfMonths=numberOfYears*12;
		this.loanAmount=loanAmount;
		
	}
	public double getMonthlyPayment() {
		return(loanAmount*monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberOfMonths))/(Math.pow(1+monthlyInterestRate, numberOfMonths)-1);
		
	}
	public double getTotalPayment() {
		return getMonthlyPayment()*numberOfMonths;
	}
	



}
