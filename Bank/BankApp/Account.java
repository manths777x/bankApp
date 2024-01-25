package BankApp;

public abstract class Account implements IBaseRate {

	// list of common properties for saving and checking account

	private String name;
	private String sSN;
	private double balance;

	static int index = 10000;
	protected String accountNumber;
	protected double rate;

	// Constructor to set base properties and initilize account
	public Account(String name, String sSN, double initDeposit) {

		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;

		// set account
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}

	private String setAccountNumber() {
		String last2SSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueid = index;
		int randnumber = (int) (Math.random() * Math.pow(10, 3));
		return last2SSN + uniqueid + randnumber;

	}

	public void compound() {

		double accIntrate = balance * (rate / 100);

		balance = balance + accIntrate;
		System.out.println("Your compound intrest is : $ " + accIntrate);

	}

	// list of common methods

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdraw $" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance + amount;
		System.out.println("Transfer $" + amount + " to " + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is : $" + balance);
	}

	public void showinfo() {
		System.out.println("Name: " + name + "\n Account Number: " + accountNumber + "\n Balance: " + balance
				+ "\n Rate: " + rate + " %");
	}

	public abstract void setRate();
}
