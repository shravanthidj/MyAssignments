package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classroom 2: Print only unique characters in the given string
		 String companyName = "google";// --> "gole"
		 String output="";
		 char[] cs = companyName.toCharArray();
		 Set<Character> charAbc= new LinkedHashSet<Character>();
		// Hints: convert to chararray Use Set with add method.
		 for(Character c: cs) {
			 boolean add = charAbc.add(c);
			 
		 }
		// System.out.println(charAbc);
		 
		 for(Character a:charAbc) {
			 output=output+a;
		 }
			/*
			 * for(Character c: cs) { if(charAbc.add(c)) { output=output+charAbc; } }
			 */
		 
		 System.out.println(output);
	}

}
