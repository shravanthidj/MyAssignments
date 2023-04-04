package week2.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare and initialize array
		int arr[]= {9,7,3,4,2,6,1,8};
		
		//sort the array
		Arrays.sort(arr);
		
		//Loop through elements in array
		for(int i=0;i<arr.length-1;i++) {
			
			if((i+1)!=arr[i]) {
				System.out.println("Missing element is "+(i+1));
				break;
			}
		}
		

	}

}
