package org.student.week3Day1Asnmt2;

import org.college.week3Day1Asnmt2.College;
import org.department.week3Day1Asnmt2.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Name of the student is Swapna");
	}
	public void studentDept() {
		System.out.println("Department is IT");
	}
	public void stdentID() {
		System.out.println("Student ID is 123");
	}
public static void main(String[] args) {
	Student s= new Student();
	College c= new College();
	Department d=new Department();
	s.studentName();
	s.studentDept();
	s.stdentID();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	d.deptName();
}
}
