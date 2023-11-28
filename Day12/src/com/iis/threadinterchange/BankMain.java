package com.iis.threadinterchange;

public class BankMain {
  public static void main(String[] args) {
	Bank b=new Bank();
	WithdrawThread wt=new WithdrawThread(b);
	DepositThread dt=new DepositThread(b);
	wt.start();
	dt.start();
	
}
}
