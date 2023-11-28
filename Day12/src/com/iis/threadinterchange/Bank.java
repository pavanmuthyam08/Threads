package com.iis.threadinterchange;

public class Bank {
	double balance=10000;
	public synchronized void withdraw(double amount)
	{
		if(balance<amount) {
			System.out.println("Insufficent Balance...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance=balance-amount;
		System.out.println("The Balance after Withdraw "+this.balance);
	}
	public synchronized void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("The Amount is After Deposit "+this.balance);
		notify();
	}
}
