package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		
		System.out.println("Student Name is = G.Karuppasamy");
	}
	
	public void studentDept() {
		
		System.out.println("Student Department Name is = MAster of Computer Application (MCA)");
	}
	
	public void studentId() {
		
		System.out.println("Student ID Number is = A8138716");
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		
		std.deptName();
		
		std.studentName();
		std.studentId();
		std.studentDept();
	}

}
