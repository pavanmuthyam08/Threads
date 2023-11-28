package com.iis.day12Assignment;

public class MultipleofFive extends Thread{
	public void run() {
    	for(int x=1;x<=7;x++) {
    		int val=5*x;
    		//val=val*x;
    		System.out.println("Multiple of seven "+val);
    		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }

}
