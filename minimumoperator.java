package operator;

import java.util.Scanner;

public class minimumoperator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 4 numbers to find a minimum number");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		double min;
		
		min = ( a<b && a<c && a<d ) ? a:
			(b<a && b<c && b<d  ) ? b:
				(c<a && c<b && c<d ) ? c: d;
		System.out.println("minimum number is" +min);
	}
	
}
