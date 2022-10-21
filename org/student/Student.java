package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student name:Rohini J");
	}
	public void studentDept() {
		System.out.println("student Dept:ECE");
	}
	public void studentId() {
		System.out.println("Student Id:3123141");
	}

	public static void main(String[] args) {
	Student s = new Student();
	s.collegeName();
	s.collegeCode();
s.collegeRank();
s.deptName();
s.studentName();
s.studentDept();
s.studentId();
	}

}
