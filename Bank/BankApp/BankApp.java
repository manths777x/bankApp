package BankApp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {
		
		List<Account> account  = new LinkedList<Account>();
		
		String file ="D:\\Java Workspace\\javaProject\\csv.csv";
		try {
			List<String[]> newAcc=utilties.csv.read(file);
		

			for (String[] AccH : newAcc) {
				
				String name=AccH[0];
				String sSH=AccH[1];
				String accountType=AccH[2];
				double initDeposit=Double.parseDouble(AccH[3]);
				
				//System.out.println(name + "		" + sSH + "		 " + accountType + "	 " +initDeposit);
				
				if( accountType.equals("Saving")){
					
					//System.out.println("Open a Saving Account");
					account.add(new Saving(name, sSH, initDeposit));
				}
				else  if( accountType.equals("Checking")) {
					//System.out.println("Open a Checking Account");
					account.add(new Saving(name, sSH, initDeposit));
				}
				else {
					System.out.println("Error reading account type");
				}
			
			}
			for (Account acc: account) {
				System.out.println("\n**************************");
				acc.showinfo();
			}
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*
		Checking cAcc = new Checking("Mathan Patil", "30955532101", 1500);

		Saving sAcc = new Saving("Nitin Patil", "20955532412", 1500);
		sAcc.compound();
		cAcc.showinfo();
		System.out.println("***************************");
		sAcc.showinfo();
		sAcc.deposit(2000);
		sAcc.withdraw(1000);
		sAcc.transfer("Ketan", 500);

		// TODO Auto-generated method stub
*/
	}

}
