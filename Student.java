package com.xworkz.linkedlist;

public class Student {
	
	private String name;
	private int rollno;
	private char section;
	
	public Student(String name, int rollno, char section) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", section=" + section + "]";
	}
	
	
}
