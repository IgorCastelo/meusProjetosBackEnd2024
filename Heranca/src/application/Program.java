package application;

import enttities.Account;
import enttities.BusinessAccount;
import enttities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING(É FAZER UMA SUBCLASSE VIRAR UMA SUPER CLASSE)
	
		Account acc1 = bacc;
		Account acc2 =  new BusinessAccount(1003, "bob", 0.0, 200.0);
		Account acc3 =  new SavingAccount(1004,"Anna", 0.0, 0.01);
		
	
		//DOWNCASING(É FAZER UMA SUPERCLASSE VIRAR UMA SUBCLASSE))
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		
	//	BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
 		}
	}
}