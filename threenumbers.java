package operator;

public class threenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a =100;
		int b = 20;
		int c = 400;
		
		int max;
		max = (a > b && a > c ) ? a:
			(b > a && b>c) ? b : c;
		System.out.println(max);
		
	}

}
