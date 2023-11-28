package com.iis.day12Assignment;

public class MultipleofSeven extends Thread
{
    public void run() {
    	for(int x=1;x<=5;x++) {
    		int val=7*x;
    		//val=val*x;
    		System.out.println("Multiple of seven "+val);
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    public static void main(String[] args) {
		MultipleofSeven ms=new MultipleofSeven();
		
		MultipleofFive mf=new MultipleofFive();
		ms.start();
		try {
			ms.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mf.start();
		try {
			mf.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
