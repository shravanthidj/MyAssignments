package week2.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax type1
		int data[] = {54,6,23,22,25,34,45,19,7,0,2,46};
		//syntax type2
		int[] data1 = {76,46,34,643,753,35,82,37};
		
		
		//to get the length of the array.. length is a property of an array to get the size of array, its a global variable
		int length = data.length;
		System.out.println(length);
		
		
		//Index[0] - used to get the value of the particular index
		System.out.println(data[5]);
		
		//to print the last value in the array
		System.out.println("Last value of array "+data[length-1]);
		
		//to print 2nd last value in the array
		System.out.println("Second Last value of array "+data[length-2]);
		
		// to arrange the array in ascending order - sort
		//arrays.sort()-method is available for array to sort in ascending
		//this will sort in ascending order
		Arrays.sort(data);
		
		
		System.out.println(data[0]);
		// for loop to print the data is ascending order
		 for(int i=0;i<data.length;i++) { System.out.println("Sorted value of array" +
		 data[i]); }
		 // for loop to print the data in descending order
		 for (int i=data.length-1;i>=0;i--) {
			 System.out.println("Descending order "+ data[i]);
		 }
	}

}
