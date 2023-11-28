package com.iis.day12Assignment;

public class Thread1 extends Thread{
  BankAccount obj;
  public Thread1(BankAccount obj) {
	  this.obj=obj;
  }
  public void run() {
	  obj.withdraw(500);
  }
}
