package week3.day1;

public class LearnMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnMethodOverloading MthdOverloadingObj= new LearnMethodOverloading();
		MthdOverloadingObj.add();
		MthdOverloadingObj.add(2,5);
		int add = MthdOverloadingObj.add(1, 66,45);
		System.out.println("Add" +add);
		
		System.out.println(MthdOverloadingObj.name());
		System.out.println(MthdOverloadingObj.name("test"," leaf login"));

	}
	public void add() {
		int a=1,b=4;
		System.out.println(a+b);
	}
	public void add(int a, int b) {
		int c;
		c=a+b;
		System.out.println(c);
	}
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public String name() {
		return " Test Leaf";
	}
	
	public String name(String a,String b) {
		return a + " "+ b;
	}

}
