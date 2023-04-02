package week1.day2;

public class Learnvariable {

	//global variable
	int num=35; // only inside main method, we need to declare it as static
	// in any general method- we can directly use it as it is
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learnvariable lv= new Learnvariable();
		lv.add();
		
	}
	
	public void add() {
		// local variable
				int age =32;
				System.out.println(num);
				System.out.println(age);
	}

}
