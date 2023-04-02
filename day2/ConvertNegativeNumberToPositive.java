package week1.day2;

public class ConvertNegativeNumberToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=04;
		ConvertNegativeNumberToPositive obj=new ConvertNegativeNumberToPositive();
		obj.convertNumToPositiveNum(number);

	}
	
	public void convertNumToPositiveNum(int num) {
		if(num<0)
			num=(-num);
		System.out.println("Positive Number is "+num);
	}

}
