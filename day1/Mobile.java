package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobileObject = new Mobile();
		mobileObject.sendSMS();
		mobileObject.makeCall();

	}

	public void sendSMS(){
		System.out.println("From Oppo");	
	}

	public void makeCall(){
		System.out.println(" calling my friend!!");
	}

}
