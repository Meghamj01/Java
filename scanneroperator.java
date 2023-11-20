package operator;

import java.util.Scanner;

public class scanneroperator {
	public static void main(String[] args) {
		//post increment
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the post increment");
		int a=sc.nextInt();
		int b=a++;
		System.out.println("post increment");
		System.out.println("-------------");
		System.out.println("B: " +b);
		System.out.println("A: " +a);
		
		//pre increment
	
		System.out.println("enter the pre incrment");
		int a1=sc.nextInt();
		int b1=++a1;
		System.out.println("pre increment");
		System.out.println("-------------");
		System.out.println("B1: "+b1);
		System.out.println("A1: "+a1);
		
		//post decrement
		
	
		System.out.println("enter the post decrement");
		int a2=sc.nextInt();
		int b2=a2--;
		System.out.println("post decrement");
		System.out.println("-------------");
		System.out.println("B2: " +b2);
		System.out.println("A2: " +a2);
		
		
		//pre decrement
		
		System.out.println("enter the pre decrement");
		int a3=sc.nextInt();
		int b3=--a3;
		System.out.println("pre decrement");
		System.out.println("-------------");
		System.out.println("B3: " +b3);
		System.out.println("A3: " +a3);
		
		
		
		
	}

}
