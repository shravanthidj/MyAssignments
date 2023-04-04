package week2.day1;

public class LearnAccessSpecifierFromAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnAccessModifier am = new LearnAccessModifier();
		//Only default and Public can be accessed from other class within same package
		am.getData();
		am.getName();
	}

}
