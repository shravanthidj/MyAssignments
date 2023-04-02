package week1.day2;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to check given number is even or not
		int data=56538;
		
		if(data%2==0) {
			System.out.println(data +" is Even Number");
		}
		else if((data%2!=0)||(data%2==1))
		{
			System.out.println("Odd Number");
		}
		else {
			System.out.println("Not Number");
		}
	}

}
