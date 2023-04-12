package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber_List {

	public static void main(String[] args) {
		
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(3);
		data.add(2);
		data.add(11);
		data.add(4);
		data.add(6);
		data.add(7);
		
		Collections.sort(data);
		System.out.println(data);
		System.out.println(data.get(data.size()-2));
	}
}
