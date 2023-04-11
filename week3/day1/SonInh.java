package week3.day1;

public class SonInh  extends ParentInh{
	
	public void house() {
		System.out.println("a 3 bhk villa in whitefield");
	}

	public static void main(String args[]) {
		SonInh sobj=  new  SonInh();
		//Example of multi level inheritance
		sobj.house();
		sobj.ecrHouse();
		sobj.ownHouse();
		sobj.ownLand();
	}
}
