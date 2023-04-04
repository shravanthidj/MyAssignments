package week2.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array_one = {3,2,11,4,6,7};	 
		int[] array_two = {1,2,8,4,9,7};
		
		 int count=0, len=array_one.length;
		 int[] array_result= new int[len];
		for(int i =0; i<array_one.length;i++) {
			
			for(int j=0;j<array_two.length;j++) {
				if(array_one[i]==array_two[j]) {
					array_result[count]=array_one[i];
					System.out.println(array_result[count]);
					count++;
					
				}
			
				
				
				
			}
		}
		 
		 

	}

}
