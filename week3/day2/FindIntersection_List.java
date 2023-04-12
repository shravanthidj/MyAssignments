package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> a2 = new ArrayList<Integer>();
		
		a1.add(3);
		a1.add(2);
		a1.add(11);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		
		a2.add(1);
		a2.add(2);
		a2.add(8);
		a2.add(4);
		a2.add(9);
		a2.add(7);
		
		for(int i=0;i<=a1.size();i++) {
			for(int j=i;j<a2.size();j++) {
				if(a1.get(i)==a2.get(j))
					System.out.println(a1.get(i));
					
			}
		}
	}

}
