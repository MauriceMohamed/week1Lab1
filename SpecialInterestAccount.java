
public class SpecialInterestAccount extends InterestAccount{
	private double premiumInterestRate;
	private int countDebit = 0;
	private int countCredit = 0;

	public SpecialInterestAccount(double balance, double monthlyInterestRate, double premiumInterestRate) {
		super(balance, monthlyInterestRate);
		this.premiumInterestRate = premiumInterestRate;
	}

	public double getPremiumInterestRate() {
		return premiumInterestRate;
	}

	public void setPremiumInterestRate(double premiumInterestRate) {
		this.premiumInterestRate = premiumInterestRate;
	}

	@Override
	public boolean debit(double amount) {
		countDebit++;
		System.out.println("You have withdraw: "+ amount);
		System.out.println("You have withdraw: "+countDebit+" time this month.");
		// TODO Auto-generated method stub
		return super.debit(amount);
		
	}
	@Override
	public void credit(double amount) {
		countCredit++;
		System.out.println("You have added: "+ amount);
		System.out.println("You have added monney : "+ countCredit+" times this month.");
		// TODO Auto-generated method stub
		super.credit(amount);
	}

	@Override
	public String toString() {
		return "Special Interest Account [Premium Interest Rate= " + premiumInterestRate+"]" + "\n[No of Debit: " + countDebit+"]"
				+ "\n[no of Credit=" + countCredit + "]";
	}
	public double interestChoice() {
		if (countDebit <= 3) {
			return premiumInterestRate;
		}else {
			return getMonthlyInterestRate();
		}
	}
	public double interestChoiceCalculated() {
		if (countDebit <= 3) {
			return getBalance()*premiumInterestRate;
		}else {
			return getBalance()*getMonthlyInterestRate();
		}
	}
	public String finalInterest() {
		return "[Speciale Interest Account]\n[Balace before interest: "+getBalance()+"]\n[No of debit: "+countDebit+"]\n[Interest Rate: "+interestChoice()+
				"]"+"\n[Interest: "+interestChoiceCalculated()+"]"+"\n[Total: "+(getBalance()+interestChoiceCalculated())+"]";
		
	}
	
	
	


	
	
}
