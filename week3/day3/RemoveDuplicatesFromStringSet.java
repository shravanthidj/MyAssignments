package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromStringSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		String[] s=text.split(" ");
		Set<String> StrSet = new LinkedHashSet<String>();
		
		for(String temp:s) {
			if(StrSet.contains(temp)) {
				StrSet.add("");
			}
			else
			StrSet.add(temp);
		}
		System.out.println(StrSet);
	}
	
	

}
