package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_ClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		//i declear a set
		Set<Integer> s1 = new HashSet<Integer>();
		for(Integer n: num){
			s1.add(n);
		}
		System.out.println(s1);
	}

}
