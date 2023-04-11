package week3.day1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		System.out.println("Addition of "+cal.add(78, 34));
		System.out.println("Addition of "+cal.add(43, 60, 70));
		System.out.println("Multiplication of "+cal.mul(23434, 34));
		System.out.println("Multiplication of "+cal.mul(20, 345345));
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	double mul(int a, double b) {
		return (a*b);
	}
	
	double mul(double a, double b) {
		return (a*b);
	}

}
