package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Declare a String
		String text="PayPal India";
		
		//Convert it into a character array
		char[] ch= text.toCharArray();
		
		//Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();
		
		//Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();
		
		for(Character c: ch) {
			boolean add = charSet.add(c);
			//if the character is already in the charSet then, add it to the dupCharSet
			if(!add)
				dupCharSet.add(c);
		}
		
		for(Character chs:charSet) {
			if(chs!=' ') {
				charSet.add(chs);
				System.out.println(chs);
			}
		}
		
		System.out.println(charSet);
		System.out.println(dupCharSet);
	}

}
	