package week3.day3;

public class LearnThis extends ParentClassThis{

	
	public void age() {
		System.out.println("32");
		//this.age();// refers current class
		super.age();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnThis lt = new LearnThis();
		lt.age();
	}

}
