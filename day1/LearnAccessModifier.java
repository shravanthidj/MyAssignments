package week2.day1;

public class LearnAccessModifier {

	//public access modified
	public void getName() {
		System.out.println("Test Leaf!");
	}
	//private access modifies
	private void getNum() {
		System.out.println("123456");
	}
	//Default access modifier
	void getData() {
		System.out.println("DAta");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnAccessModifier am = new LearnAccessModifier();
		am.getData();
		am.getName();
		am.getNum();
		
	}

}
