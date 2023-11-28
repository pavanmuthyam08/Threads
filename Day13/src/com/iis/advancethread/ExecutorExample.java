package com.iis.advancethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadDemo implements Runnable
{

	public void run() {
		System.out.println("Thread name is "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
public class ExecutorExample{
	public static void main(String[] args) {
		ExecutorService executord=Executors.newFixedThreadPool(20);
		for(int i=0;i<101;i++)
		{
			Runnable r1=new ThreadDemo();
			executord.submit(r1);
		}
	}
	
}
