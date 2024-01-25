package BankApp;

public interface IBaseRate {
	// method to return base rate
	void setRate();

	default double getBaseRate() {
		return 2.5;
	}

}
