
public class InterestAccount extends Account {
	
private double monthlyInterestRate;

public InterestAccount(double balance, double monthlyInterestRate) {
	super(balance);
	this.monthlyInterestRate = monthlyInterestRate;
}
public void addMonthlyInterest() {
	double interest = getBalance()*monthlyInterestRate;
	super.credit(interest);
	System.out.println("This month Interests :"+interest);
}
public double getMonthlyInterestRate() {
	return monthlyInterestRate;
}
public void setMonthlyInterestRate(double monthlyInterestRate) {
	this.monthlyInterestRate = monthlyInterestRate;
}
@Override
public String toString() {
	return "InterestAccount [onthly Interest Rate:" + monthlyInterestRate + "]";
}


	
	
	

}
