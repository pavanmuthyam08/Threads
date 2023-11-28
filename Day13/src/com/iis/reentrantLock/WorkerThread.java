package com.iis.reentrantLock;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.locks.ReentrantLock;

public class WorkerThread implements Runnable
{
   String name;
   ReentrantLock lock;
   //WorkerThread constractor
   public WorkerThread(ReentrantLock lock,String name)
   {
	   this.lock=lock;
	   this.name=name;
   }
   //impementing the run() method of Runnable Interface
   public void run()
   {
	   boolean execution=true;
	   while(execution)
	   {
		   //get outer lock using tryLock method
		   boolean result=lock.tryLock();
		   //the tryLock() method returns true when the lock is free
		   if(result)
		   {
			   //try section of Outer Lock
			   try
			   {
				   //creating the Date Instance of Date class
				   Date dateobj=new Date();
				   //Converting the dateobj into SimpleDateFormat  
				   SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
				   System.out.println("Task: "+name+"outer Lock is acquired at "+sdf.format(dateobj));
				   //Use sleep() method of Thread class
				   Thread.sleep(1500);
				   //get inner Lock usinglock()
				   lock.lock();
				   //try section of inner lock
				   try
				   {
					   dateobj=new Date();
					   sdf=new SimpleDateFormat("hh:mm:ss");
					   System.out.println("Task: "+name+"inner lock acquired at "+sdf.format(dateobj));
					   //Use getHoldCount() method to get lock hold count of inner lock
					   System.out.println("The lock hold count of inner lock :"+lock.getHoldCount());
					   //use sleep
					   Thread.sleep(1000);
				   }
				   //catch lock for handling inner lock exception
				   catch(InterruptedException e)
				   {
					   e.printStackTrace();
				   }
				   //finally lock for inner block release
				   finally {
					   //inner block release
					   System.out.println("The inner lock is released by task: "+name);
					   lock.unlock();
				   }
				   //use grtHoldCount() method to get lock hold count of inner lock
				   System.out.println("The lock hold count of inner lock: "+lock.getHoldCount());
				   System.out.println("The work of the "+name+"task is done");
				   //set result to true
				   result=true;
			   }
			   catch(InterruptedException e)
			   {
				   e.printStackTrace();
			   }
			   //finally blockfor releaseing the outer lock
			   finally
			   {
				   //outter lock released
				   System.out.println("The Outer lock released by task "+name);
				   lock.unlock();
				   System.out.println("The Lock hold count of outer lock: "+lock.getHoldCount());
			   }
		   }
		   else {
			   //print that task waiting for locks
			   System.out.println("Task "+name+"is waiting for the lock");
			   try
			   {
				   //use sleep method to suspend execution
				   Thread.sleep(1000);
			   }
			   catch(InterruptedException e) {
				   e.printStackTrace();
			   }
		   }
		   
		   execution=false;   
 	   }
	   
   }
   
}
