package com.iis.thread;

public class UserThread extends Thread {
	User u;
	public UserThread() {
	  u=new User();
	  u.setUsername("admin");
	  u.setPassword("admin");
	}
	public void run() {
		if(u.getUsername().equals("admin")&&u.getPassword().equals("admin"))
		{
			System.out.println("valid user");
		}
		else
		{
			System.out.println("Invalid User");
		}
	}
	public static void main(String[] args) {
		UserThread ut=new UserThread();
		ut.start();
	}

}
