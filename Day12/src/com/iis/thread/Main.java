package com.iis.thread;

public class Main  {
  public static void main(String[] args) {
	MainThread m=new MainThread();
	
	m.setName("EvenThread");
	m.start();
	m.setName("OddThread");
	m.start();
	
}
}
