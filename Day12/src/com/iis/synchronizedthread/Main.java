package com.iis.synchronizedthread;

public class Main {
	
	public static void main(String[] args) {
		PrintTable p=new PrintTable();
		Thread1 t1=new Thread1(p);
		t1.start();
		Thread2 t2=new Thread2(p);
		t2.start();
		
	}

}
