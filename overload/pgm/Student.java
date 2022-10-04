package com.overload.pgm;

public class Student {

	public void getStudentInfo(int id) {

		System.out.println("The Student ID Is = "+id);		
	}

	public void getStudentInfo(int id, String name) {

		System.out.println("The Student ID is = "+id);
		System.out.println("Name of the Student is = "+name);
	}

	public void getStudentInfo(String eMail, long phn_Number) {

		System.out.println("Student E-Mail ID is = "+eMail);
		System.out.println("Student Phone Number is = "+phn_Number);
	}

	public static void main(String[] args) {

		Student std = new Student();
		
		std.getStudentInfo(206);
		std.getStudentInfo(201, "Karuppasamy");
		std.getStudentInfo("test123@abc.com", 8721673432l);
	}

}
