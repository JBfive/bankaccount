package com.codingdojo.bankaccount;
import java.util.Random;
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount first = new BankAccount();
		first.deposite(100.00, "checking");
		first.deposite(976.55, "savings");
		first.withdraw(35.65, "savings");
		first.withdraw(300.00, "checking");
		first.total();

	}

}
