package week1.day1;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car i20 = new Car();
		i20.driveCar();
		i20.soundHorn();
		i20.appylyBrake();
		i20.isPuncture();

	}
	public void driveCar(){
		
		System.out.println("Inside: Drive Car Method");
	}
	public void appylyBrake(){
		System.out.println("Inside: Apply break method");
	}
	public void soundHorn(){
		System.out.println("Inside: Sound Horn Method");
	}
	public void isPuncture(){
		System.out.println("Inside: is Puncture Method");
	}

}
