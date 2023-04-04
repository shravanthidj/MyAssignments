package week2.day1;

public class FindDuplicateValuesInArray {

	public static void main(String[] args) {

		int num[]= {45,34,45,78,56,88,45,56,37,9,23};
		
		//int num[]= {2,5,7,7,5,9,2,3};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {	
				
				if(num[i]==num[j]) {
					System.out.println("duplicate values "+num[j]);
				}
			}
				
		}
	}

}
