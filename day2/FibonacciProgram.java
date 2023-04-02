package week1.day2;

public class FibonacciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciProgram obj = new FibonacciProgram();
		obj.fibonacci(20);
	}
	
	public void fibonacci(int num) {
		
		int firstNum=0,secondNum=1;
		
		for(int i=1;i<=num;i++) {
			System.out.print(firstNum + ", ");
			int nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
		}
	}

}
