package BankApp;

public class Saving extends Account {

	// List of properties that specific to saving account
	private int SafetyDepostBoxID;
	private int SafetyDepostBoxKey;

	// Constructor to initilise saving properties
	public Saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepostBox();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}

	private void setSafetyDepostBox() {
		SafetyDepostBoxID = (int) (Math.random() * Math.pow(10, 3));
		SafetyDepostBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// list of methods that sp. to saving account
	public void showinfo() {
		super.showinfo();
		// System.out.println("Account Type: Saving");
		System.out.println("Your Saving acount details:" + "\n Safety Deposit Box ID: " + SafetyDepostBoxID
				+ "\n Safety Deposit Box Key: " + SafetyDepostBoxKey);
	}

}
