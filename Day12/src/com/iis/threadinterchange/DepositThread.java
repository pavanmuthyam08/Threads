package com.iis.threadinterchange;

public class DepositThread extends Thread{
   Bank obj;
   public DepositThread(Bank obj) {
	   this.obj=obj;
   }
   public void run() {
	   obj.deposit(900000);
   }
}
