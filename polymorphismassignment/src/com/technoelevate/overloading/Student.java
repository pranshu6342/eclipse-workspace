package com.technoelevate.overloading;

public class Student {
	private String name;
	private long mob;
	private String course;

	public Student(String name, long mob, String course) {
		super();
		this.name = name;
		this.mob = mob;
		this.course = course;
	}

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public long getMob() {
		return mob;
	}

	public String getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}
