package week1.day2;

public class LearnSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int voteAge=17;
		
		if(voteAge>=18) {
			System.out.println("Eligible for vote " + voteAge);
		}
		else { //if age is lessthan or equals 17 -this part will be executed
			System.out.println("Not Eligible for Vote "+voteAge);
		}
			
	}

}
