package week2.day1;

public class LearnString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		//literal type  - stored in collection memory
		String name= "Test";  
		
		//Initiation Type -- stored in heap memory
		String newName = new String("test"); 
		
		//to find length
		int length=name.length();
		System.out.println("Length of string is "+length);

		// compare two string  address
		if(name == newName)
			System.out.println("== comparsion String matches");
		else
			System.out.println("== comparsion Sting not matches");
		
		
		//verifies the text of the string
		if(name.equals(newName))
			System.out.println("Equal Case String matches");
		else
			System.out.println("Equal Case Sting not matches");
		
		//equal ignore case- to verify the text o sting irrespective of case
		if(name.equalsIgnoreCase(newName))
			System.out.println("Equal Ignore case String matches");
		else
			System.out.println("Equal Ignore case  Sting not matches");
		
		//convert string into charArray
		String companyName="Sapiens";
		char[] ch=companyName.toCharArray();
		//System.out.println("Char Array "+ch);
		System.out.println("Looping Array");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		
		//Contains -- to check whether given string is present or not
		String check="TestLeaf";
		boolean contains=check.contains("le");
		System.out.println(contains);
		
		//reverse string
		
		
		//split - used to remove space or a character
		String newsHeader="Amazon launches new app exclusive for clothing";
		String[] splitWord= newsHeader.split(" ");
		for(int i=0;i<splitWord.length;i++) {
			System.out.print(splitWord[i]);
		}
		
		
		
		
		
	}

}
