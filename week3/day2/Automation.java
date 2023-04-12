package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation obj= new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
		

	}	
	
		public void java() {
			// TODO Auto-generated method stub
			System.out.println("Java method implemented in Automation Class");
		}
		
		@Override
		public void ruby() {
			// TODO Auto-generated method stub
			System.out.println("Ruby method implemented in Automation class");
		}
		public void selenium() {
			// TODO Auto-generated method stub
			System.out.println("Selenium Class implemented in Automation class");
		}	

}
