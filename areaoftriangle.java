import java.util.Scanner;

public class areaoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("area of triangle");
	
		double b=sc.nextInt();
		System.out.println("enter the base" +b);
		double h=sc.nextInt();
		System.out.println("enter the height" +h);
		
		double area=b*h*0.5;
		System.out.println(area);
	}

}
