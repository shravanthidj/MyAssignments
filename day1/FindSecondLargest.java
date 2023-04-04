package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare and initialize an array
		int[] arr_num= {10,30,25,55,70,15,80,90,95};
		
		// sort the array using Arrays.sort()
		Arrays.sort(arr_num);
		
		//Print the second largest number in the array
		System.out.println("Second largest number in the given array is "+ arr_num[arr_num.length-2]);
		
		
		
	}

}
