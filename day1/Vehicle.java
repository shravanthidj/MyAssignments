package week1.day1;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle();
		car.applyBreak();
		car.soundHorn();
		
		int regNumber = car.regNumber();
		System.out.println(regNumber);
		
		System.out.println(car.regNumber());
		
		String name = car.name();
		System.out.println(name);
		
		System.out.println(car.name());

	}
	
	public void applyBreak(){
		System.out.println("i apply break");
	}

	public void soundHorn(){
		System.out.println("i press sound horn");
	}
	
	public void accelerate() {
		
	}
	
	public int regNumber() {
		
		return 4530;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public String name() {
		return "TestLeaf";
	}
}
