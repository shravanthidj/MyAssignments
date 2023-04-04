package week2.day1;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  text = "We learn java basics as part of java sessions in java week1";
		text=text.toLowerCase();
				
		char[] ch=text.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			int count=0;
			for(int j=1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					if(count>1)
						ch[i]=' ';
						
				}
					
			}
			
			
		}
		System.out.println("Ch Array: " +text.valueOf(ch));
		
	}

}
