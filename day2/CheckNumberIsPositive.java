package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=-3;
		CheckNumberIsPositive obj= new CheckNumberIsPositive();
		System.out.println(obj.isPositive(number));

	}
	
	 public boolean isPositive(int num) {
		boolean result=true;
		 if(num>=0)
			 result=true;
		 else
			result=false;
		return result;
			
			
	}

}
