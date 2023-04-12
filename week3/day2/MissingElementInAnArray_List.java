package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(7);
		data.add(6);
		data.add(8);
		
		Collections.sort(data);
		
		for(int i=1;i<=data.size();i++) {
			int a=data.get(i-1);
			if(a!=i) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
