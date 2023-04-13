package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		//Output= We learn java basics as part of sessions in week1
		
		//Split the String based on white spaces and save as String Array ,Then iterate the Array	
		String s[] = text.split(" ");
		Set<String>unique = new LinkedHashSet<String>();
		for(int i =0; i<s.length;i++) {
			unique.add(s[i]);
		}
		
		System.out.println(unique);
	}

}
