package com.edu;

import java.util.Scanner;

public class userinputdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("my name is " +name);
		System.out.println();
		
		
		System.out.println("enter your age");
		int age= sc.nextInt();
		System.out.println("my age is " +age);
		System.out.println();
		
		System.out.println("enter your score");
		float percentage=sc.nextFloat();
		System.out.println("my percentage is " +percentage);
		System.out.println();
		
		
		}
		
		
		
		
	}

}
