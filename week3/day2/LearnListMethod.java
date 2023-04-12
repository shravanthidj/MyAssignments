package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> idNumber = new ArrayList<Integer>();
		List<String> mentors = new ArrayList<String>();
		//method to add
		mentors.add("parni");
		mentors.add("ani");
		mentors.add("koti");
		mentors.add("shravs");
		mentors.add("parni");
		
		System.out.println(mentors);
		
		//method to get size
		int size = mentors.size();
		System.out.println(size);
		
		//method to add value at specific postion
		mentors.add(2, "Raj");
		System.out.println(mentors);
		
		//to get the value from the list using index
		String name = mentors.get(3);
		System.out.println(name);
		
		//remove the data using index
		String remove = mentors.remove(1);
		System.out.println(remove);
		
		//contains - to check the given name is present in the list or not
		boolean contains = mentors.contains("shravs");
		System.out.println("Contains "+contains);
		
		//removeall - to remove all the values from the list
		mentors.removeAll(mentors);
		
		
		System.out.println(mentors);
		
		//clear method
		mentors.clear();
		System.out.println(mentors);
		
		//to check the list isempty
		boolean empty = mentors.isEmpty();
		System.out.println(empty);
	}

}
