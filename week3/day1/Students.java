package week3.day1;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students sObj=new Students();
		sObj.getStudentInfo();
		sObj.getStudentInfo(10909);
		sObj.getStudentInfo(109049,"Sujith");
		System.out.println(sObj.getStudentInfo("parnith.padirthi@gmail.com", 32423523523d));
	}
	void getStudentInfo() {
		System.out.println("Method to get the student info");
		
	}
	
	
	void getStudentInfo(int id) {
		System.out.println("Id of the Student is "+ id);
	}
	
	void getStudentInfo(int id, String name) {
		System.out.println("Id and name of the student is "+ id + " " + name);
		
	}
	
	String getStudentInfo(String email, double phn) {
		return "name of the student and email " + email + " "+ phn;
	}

}
