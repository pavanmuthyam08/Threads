package com.iis.futureTask;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<String>
{
   private long waittime;
   public Mycallable(int timeinMillisec)
   {
	   this.waittime=timeinMillisec;
   }
	@Override
	public String call() throws Exception {
		Thread.sleep(waittime);
		return Thread.currentThread().getName();
	}

}
