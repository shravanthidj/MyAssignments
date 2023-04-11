package week3.day1;

	public class SmartPhone extends AndriodPhone {
		public void connectWhatsApp() {
			System.out.println("Connect whtsapp from SmartPhone Class");
		}
		
		public static void main(String a[]) {
			SmartPhone MyPhone = new SmartPhone();
			MyPhone.sendMsg();
			MyPhone.makeCall();
			MyPhone.saveContact();
			MyPhone.takeVideo();
			MyPhone.connectWhatsApp();
		}
}
