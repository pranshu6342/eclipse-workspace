package com.technoelevate.encapsulation;

public class Employee {
	private String empId = "TY";
	private static int id = 0;
	private String name;
	private final String COMPANYNAME = "TECHNO ELEVATE";
	private String enteyTiming;
	private String topics;
	private String exitTiming;

	public Employee(String name, String enteyTiming, String topics, String exitTiming) {
		super();
		this.name = name;
		this.enteyTiming = enteyTiming;
		this.topics = topics;
		this.exitTiming = exitTiming;
	}

	public String getEmpId() {
		empId += ++id;
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getEnteyTiming() {
		return enteyTiming;
	}

	public String getTopics() {
		return topics;
	}

	public String getCOMPANYNAME() {
		return COMPANYNAME;
	}

	public String getExitTiming() {
		return exitTiming;
	}

}