package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "changeme";
		int size=name.length();
		char name_arr[]=name.toCharArray();		
		
		for(int i=0;i<name_arr.length;i++) {
			
			if(i%2!=0) {
				name_arr[i]=Character.toUpperCase(name_arr[i]);
					}
			
		}
		name=String.valueOf(name_arr);
		System.out.println(name);
		
	}

}
