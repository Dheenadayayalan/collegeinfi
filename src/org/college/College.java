package org.college;

public class College extends Student {
	private void collegeName() {
		System.out.println("jeppiar");

	}
	private void collegeCode() {
		System.out.println("603116");

	}
	private void collegeRank() {
		System.out.println("3");

	}
	public static void main(String[] args) {
		College a=new College();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		a.studentDept();
		a.studentId();
		a.studentName();
		a.hostelName();
		a.deptName();
	}

}
