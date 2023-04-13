package week3.day3;

public class LearnStatic {

	static int data=5;
	int data1= 10;
	//static methd
	public static void age() {
		data=data+5;
		
	}
	//non static method
	public void sum() {
		System.out.println(data1=data1+5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnStatic ls = new LearnStatic();
		//accesssing static method directly without object
		age();
		//accessing non static method
		ls.sum();
		System.out.println(ls.data1);
		
		
	}

}
