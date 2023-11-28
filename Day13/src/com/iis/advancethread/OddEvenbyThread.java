package com.iis.advancethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;
public class OddEvenbyThread implements Callable<String>
{

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "number is";
	}
	public static void main(String[] args) {
		ExecutorService excservice=Executors.newFixedThreadPool(20);
		List<String> evenlist=new ArrayList<String>();
		List<String> oddlist=new ArrayList<String>();
		Callable<String> callable=new OddEvenbyThread();
		for(int i=0;i<=100;i++) {
			if(i%2==0)
			{
				Future<String> future=excservice.submit(callable);
				try {
				String str=future.get();
				evenlist.add("Even number"+i);
				}
				catch(InterruptedException|ExecutionException e)
				{
					e.printStackTrace();
				}
			}
			else {
				Future<String> future=excservice.submit(callable);
				String oddnumber;
		        try {
					oddnumber=future.get();
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        oddlist.add("odd number"+i);
			}
			
		}
		for(String even:evenlist)
		{
			System.out.println(new Date()+"::"+even);
		}
		for(String odd:oddlist)
		{
			System.out.println(new Date()+"::"+odd);
		}
		excservice.shutdown();
		
	}

}
