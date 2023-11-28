package com.iis.day12Assignment;

public class BankAccount {
	double bal=1000.00;
 public synchronized void withdraw(double amount) {
	 System.out.println("The Amount in the Bank is "+bal);
	 if(bal>amount) {
		 bal=bal-amount;
		 System.out.println("The Balance after Withdraw is "+bal);
	 }
	 else {
		 System.out.println("Insuficent Balance");
	 }
 }
}
