package com.iis.synchronizedthread;

public class PrintTable {
	public synchronized void print(int number) {
		System.out.println("the Table of "+number);
		for(int x=1;x<=10;x++)
		{
			System.out.println(number+"*"+x+"="+number*x);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
