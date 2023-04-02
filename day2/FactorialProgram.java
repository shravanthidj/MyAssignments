package week1.day2;

class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=5;
		FactorialProgram obj= new FactorialProgram();
		System.out.println("Factorial of "+ factorial +" is "+ obj.factorial(factorial));
	}
	
	public int factorial(int num) {
		int result=1;		
		for(int i=1;i<=num;i++) {
			result= result*i;
			
		}
		
		return result;
	}

}
