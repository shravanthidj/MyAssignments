package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "TestLeaf";
		String output="";
		char[] ch = data.toCharArray();
		Set<Character> data1= new LinkedHashSet<Character>();
		Set<Character> data2= new LinkedHashSet<Character>();
		//if we use HashSet - it will print in random order
		//if we use Tree set - it will print in ASCII order
		
		for (Character character : ch) {
			boolean add = data1.add(character);
			if(!add)
				data2.add(character);
		//	output=output+character;
		}
		System.out.println(data1);
		//System.out.println(output);
		//output=data1.toString();
		System.out.println(data2);
		
	}

}
