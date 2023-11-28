package com.iis.reentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class LockMain 
{
  //define final value for MAX_VAL
	static final int MAX_VAL=2;
	public static void main(String[] args) {
		//create instance of ReentrantLock
		ReentrantLock lock=new ReentrantLock();
		//creating thread pool by using ExecutorService class
		ExecutorService pool=Executors.newFixedThreadPool(4);
		Runnable wt1=new WorkerThread(lock,"job1");
		Runnable wt2=new WorkerThread(lock,"job2");
		Runnable wt3=new WorkerThread(lock,"job3");
		Runnable wt4=new WorkerThread(lock,"job4");
		//execute jobs by using execute() method of ExecuteService
		pool.execute(wt1);
		pool.execute(wt2);
		pool.execute(wt3);
		pool.execute(wt4);
		//shuntdown ing pool
		pool.shutdown();
	}
}
