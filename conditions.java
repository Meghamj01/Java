package operator;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// for &
		int x=10;
		int y=15;
		if(++x<10 & ++y>15) {
			x++;
		}
		else {
			y++;
		}
		System.out.println(x);
		System.out.println(y);
	}

}
