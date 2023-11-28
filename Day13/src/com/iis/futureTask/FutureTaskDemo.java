package com.iis.futureTask;

import java.util.concurrent.*;

public class FutureTaskDemo 
{
	public static void main(String[] args) {
	
   Mycallable call1=new Mycallable(1000);
   Mycallable call2=new Mycallable(3000);
  
   FutureTask<String> futuretask1=new FutureTask<String>(call1);
   FutureTask<String> futuretask2=new FutureTask<String>(call2);
   
   ExecutorService excservice=Executors.newFixedThreadPool(2);
   excservice.execute(futuretask1);
   excservice.execute(futuretask2);
   
   while(true) {
	   try {
		   if(futuretask1.isDone() && futuretask2.isDone())
		   {
			   System.out.println("Done");
			   //ShutDown the executor service
			   excservice.shutdown();
			   return;
		   }
		   if(!futuretask1.isDone())
		   {
			   //wait indefinetely for futurebtask complete
			   System.out.println("FutureTask1 output= "+futuretask1.get());
		   }
		   System.out.println("Waiting for FutureTask2 to complete");
		   String s=futuretask2.get(200L, TimeUnit.MILLISECONDS);
		   if(s!=null)
		   {
			System.out.println("FutureTask2 output= "+s);   
		   }
	   }
	   catch(InterruptedException |ExecutionException e)
	   {
		   e.printStackTrace();
	   }
	   catch( TimeoutException e)
	   {
		   //Do nothing
	   }
   }
	}

}
