package com.iis.thread;
import java.util.*;
public class NumberMain {
	
	
	public static void main(String[] args) {
		NumberMain nm=new NumberMain();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice");
		System.out.println("1. Even Number");
		System.out.println("2. Odd Number");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			EvenNumber en=new EvenNumber();
			
			en.currentThread().setName("EvenThread is Working");
			

			en.start();
			
			System.out.println(en.currentThread().getName());
						break;
		case 2:
			OddNumber on=new OddNumber();
			on.currentThread().setName("Odd Thread is Working");
			on.start();
			System.out.println(on.currentThread().getName());

			break;
		}
	}

}
