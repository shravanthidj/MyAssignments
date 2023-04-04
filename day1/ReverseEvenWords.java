package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "she is software tester new one test tr";
		String word_arr[]=test.split(" ");
		int l= word_arr.length/2;
		int mod=word_arr.length%2;
		String[] even_arr;
		if(mod==0)
			even_arr=new String[l];
		else
			 even_arr=new String[l+1];
		String[] odd_arr= new String[l];
		int temp1=0,temp2=0;
		for(int i=0; i<word_arr.length;i++) {
			if(i%2 != 0) {
				odd_arr[temp1]=word_arr[i];
				temp1++;
			}
			else {
				even_arr[temp2]=word_arr[i];
				temp2++;
			}
		}
		
		String s,even_s=""; 
		char[] ch;
		
		int temp=0;
		for(int i=0;i<even_arr.length;i++) {
			int t=0;
			s=even_arr[i];
			char[] res= new char[s.length()];
			ch=s.toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
			res[t]=ch[j];
			t++;
			}
			
			
			
			System.out.println(even_s.valueOf(res));
			if(temp<l)
				System.out.println(odd_arr[temp]);
			temp++;
			
		}
		
		
		
	}

}
