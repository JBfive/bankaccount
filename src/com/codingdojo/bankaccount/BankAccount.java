package com.codingdojo.bankaccount;
import java.util.Random;
public class BankAccount {
	protected String accountNumber;
	protected double checkingBalance = 0;
	protected double savingsBalance = 0;
	protected static int numberOfAccounts = 0;
	protected static double totalMoney;
	public BankAccount() {
		this.accountNumber = generateAccount();
		this.checkingBalance = getCheckBal();
		this.savingsBalance = getSaveBal();
		System.out.println(accountNumber);
		numberOfAccounts ++;
		
	}
	protected String generateAccount() {
	Random rand = new Random();
	Long randAccount = (rand.nextInt(100_000_000)               // Last 9 digits
            + (rand.nextInt(90) + 10) * 100_000_000L); // First 2 digits
	String strAccount = Long.toString(randAccount);
	System.out.println(strAccount);
	return strAccount;
	}
	public double getCheckBal() {
		System.out.println(checkingBalance);
		return checkingBalance;
	}
	public double getSaveBal() {
		System.out.println(savingsBalance);
		return savingsBalance;
	}
	public void deposite(double check, String type) {
		if(type == "checking") {
			checkingBalance = checkingBalance + check;
			getCheckBal();
		}
		else if(type == "savings") {
			savingsBalance = savingsBalance + check;
			getSaveBal();
		}
		System.out.println("You deposited a check of " + check +" into " + type);
	}
	public void withdraw(double amount, String type) {
		if(type == "checking") {
			if(checkingBalance > amount) {
				checkingBalance = checkingBalance - amount;
				getCheckBal();
			}
			else { System.out.println("Insufficient funds");}
		}
		else if(type == "savings") {
			if(savingsBalance > amount) {
				savingsBalance = savingsBalance - amount;
				getSaveBal();
			}
			else { System.out.println("Insufficient funds");}
		}
		
		
	}
	public void total() {
		totalMoney = getCheckBal() + getSaveBal();
		System.out.println("You have "+ totalMoney +" money");
	}
}
