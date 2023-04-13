package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert string into  character array
		String name = "Shravanthi";
		char[] ch=name.toCharArray();
		//create new HashsEt
		Set<Character> chSet=new HashSet<Character>();
		
		for(Character s:ch) {
			if(chSet.contains(s))//if the char already exist, it will remove it from set
			{
				chSet.remove(s);
			}
			else
				chSet.add(s);
		}
		
		System.out.println(chSet);
	}
		

}
