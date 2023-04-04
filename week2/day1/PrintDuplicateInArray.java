package week2.day1;

import java.util.Arrays;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr_num= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arr_length = arr_num.length;
		
		//int count;
		Arrays.sort(arr_num);
		for (int i =0;i<arr_length-1;i++) {
			//count=0;
			
			for(int j=i+1;j<arr_length;j++) {
				
				if(arr_num[i]==arr_num[j])
					System.out.println("Duplicate values found are "+arr_num[i]);
			}
			
			
		}
		

	}

}
