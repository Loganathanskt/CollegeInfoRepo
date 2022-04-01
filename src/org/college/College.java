package org.college;

public class College {
	private void collegeName() {
		System.out.println("College Name is : SMIT");
		System.out.println("College Code is : 123");
	}
	private void collegeCode() {
		System.out.println("College Code is : 123");
	}
	private void collegeRank() {
		System.out.println("College Rank is : 5");
	}
public static void main(String[] args) {
	
	College c = new College();
	Student s = new Student();
	Hostel h = new Hostel();
	Dept d = new Dept();
	//batch
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	
	s.studentId();
	s.studentName();
	s.studentDept();
	
	h.hashCode();
	h.hostelName();
	
	d.deptName();
	
}
}
