package org.student;

import org.department.Department;

public class Student extends Department{
	
	protected void studentName() {
		System.out.println("Name of the Student from Student Class");
		
	} public void studentDept() {
		System.out.println("Department of Student from Student Class");
	}
	public void studentId() {
		System.out.println("Student ID from Student Class");
	}

	public static void main(String[] args) {
		Student sObj= new Student();
		sObj.collegeCode();
		sObj.collegeName();
		System.out.println(sObj.collegeRank());
		sObj.deptName();
		sObj.studentDept();
		sObj.studentId();
		sObj.studentName();
	}
}
