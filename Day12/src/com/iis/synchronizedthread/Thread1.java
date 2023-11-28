package com.iis.synchronizedthread;

public class Thread1 extends Thread
{
  PrintTable obj;
  public Thread1(PrintTable obj) {
	  this.obj=obj;
  }
  public void run() {
	  obj.print(10);
  }
}
