package week3.day3;

public class LearnStaticOne {

	
	static int x=5;
	int y=5;
	
	public static void incr() {
		x=x+5;
	}
	
	public void refer() {
		y=y+5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnStaticOne ls = new LearnStaticOne();
		System.out.println(ls.y);
		//incr();
		System.out.println(x);
		ls.refer();
		System.out.println("y data"+ ls.y );
		incr();
		System.out.println("x data" + x);
		
		System.out.println("-----------------------------");
		LearnStaticOne ls1 = new LearnStaticOne();
		ls1.refer();
		System.out.println("y data"+ ls1.y );
		incr();
		System.out.println("x data" + x);
	}

}
