package com.sunbeam;

public class Marks {
	private String subject;
	private double marks;
	
	public Marks() {
		
	}
	
	public Marks(String subject,double marks) {
		this.subject=subject;
		this.marks=marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Marks [subject=" + subject + ", marks=" + marks + "]";
	}
	
	
}
