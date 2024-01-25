package BankApp;

public class Checking extends Account {

	// List of properties that specific to checking account
	private int debitCardNumber;
	private int debitCardPIN;
	// Constructor to initilise checking properties

	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		System.out.println("Implant rate for checkings");
	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}

	// list of methods that sp. to checking account

	public void showinfo() {
		super.showinfo();
		// System.out.println("Account Type: Checking");
		System.out.println("Your Checking acount details:" + "\n Debit card number: " + debitCardNumber
				+ "\n Debit card Pin : " + debitCardPIN);

	}

}
