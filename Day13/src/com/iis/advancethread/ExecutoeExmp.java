package com.iis.advancethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;
public class ExecutoeExmp implements Callable<String>
{

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		//returns the Thread Name and Execute in callable task
		//return Thread.currentThread().getName();
		return Thread.currentThread().getName();
	}
	public static void main(String[] args) {
		ExecutorService executorser=Executors.newFixedThreadPool(20);
		List<Future<String>> list=new ArrayList<Future<String>>();
		Callable<String> callable=new ExecutoeExmp();
		for(int i=0;i<101;i++)
		{
			Future<String> future=executorser.submit(callable);
			list.add(future);
		}
		for(Future<String> in:list)
		{
			try {
				System.out.println(new Date()+"::"+in.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		executorser.shutdown();
	}

}
