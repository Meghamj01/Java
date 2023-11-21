package strings;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name : ");
		
		String a =sc.next();
		System.out.println("Enter the password : ");
		String b=sc.next();
		
		if (a.equalsIgnoreCase("megh") && b.equalsIgnoreCase("megh123"))
				{
			System.out.println("login succesfull");
			
				}else {
					System.out.println("login unsuccesfull");
				}
		

	}

}
