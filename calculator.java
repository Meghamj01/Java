package com.edu;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("calculator");
		System.out.println();
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println();
		
		int sum=num1+num2;
		int sub=num1-num2;
		int multi=num1*num2;
		float div=num1/num2;
		
		
		System.out.println("sum of two number is " +sum);
		System.out.println("subtraction of two number is " +sub);
		System.out.println("mutiplication of two number is " +multi);
		System.out.println("division of two number is " +div);
	}

}
