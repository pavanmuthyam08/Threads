package com.iis.day12Assignment;

public class BankMain {
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		Thread1 t1=new Thread1(b);
		t1.start();
		Thread2 t2=new Thread2(b);
		t2.start();
	}

}
