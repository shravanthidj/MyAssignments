package week2.day1;

public class ReverseAString {

	public static void main(String[] args) {
	
	//declare the data
	String data="Amazon";
	
	//convert into tocharArray
	char[] ch=data.toCharArray();
	
	//for loop
	for(int i=ch.length-1;i>=0;i--) {
		
		System.out.print(ch[i]);
	}
	}
	
}
