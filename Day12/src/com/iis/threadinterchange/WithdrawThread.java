package com.iis.threadinterchange;

public class WithdrawThread extends Thread{
   Bank obj;
   public WithdrawThread(Bank obj)
   {
	this.obj=obj;   
   }
   public void run() {
	   obj.withdraw(100000);
   }
}
