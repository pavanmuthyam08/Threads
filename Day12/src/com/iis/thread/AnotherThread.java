package com.iis.thread;

public class AnotherThread extends Thread{
	public void run() {
		for(int x=10;x>=0;x--) {
			System.out.println("The Another Thread Value is "+x);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
