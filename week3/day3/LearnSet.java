package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,56,67,78,67,56,7};
		Set<Integer> unq= new LinkedHashSet<Integer>();
		Set<Integer> dup= new LinkedHashSet<Integer>();
		
		for(Integer i: a) {
			boolean add = unq.add(i);
			if(!add)
				dup.add(i);
		}
		System.out.println(unq);
		System.out.println(dup);
		
		//to convert set to List - pass the set name in the method paranthesis
		List<Integer> getData = new ArrayList<Integer>(unq);
		Integer da=getData.get(3);
		System.out.println("Data Converted to List "+ getData);
		getData.add(67);
		getData.add(51);
		getData.add(51);
		
		// to convert list into set
		Set<Integer> convertedSet = new LinkedHashSet<Integer>(getData);
		System.out.println(convertedSet);// this will rmove the duplicates as its set
		
		
	}
	
	
	
}
