package operator;

public class Maxfivenumber {

	public static void main(String[] args) {
		

		int a =100;
		int b = 20;
		int c = 400;
		int d = 790;
		int e = 350;
	
		
		int max;
		max = (a > b && a > c && a > d && a > e) ? a:
			(b > a && b>c && b > d && b > e ) ? b :
			(c > a && c > b && c > d && c > e ) ? c:
				(d >a && d>b && d>c && d>e) ? d: e;
		System.out.println(max);
	}
}
