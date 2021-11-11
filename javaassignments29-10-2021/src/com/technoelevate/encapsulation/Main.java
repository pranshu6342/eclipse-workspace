package com.technoelevate.encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("pranshu", "8:30AM", "API & SERVLET's", "7:15 PM");
		Employee employee2 = new Employee("navneet", "8:30AM", "API & SERVLET's", "7:15 PM");
		System.out.println("Company Name : " + employee.getCOMPANYNAME() + "\nEmployee ID : " + employee.getEmpId()
				+ "\nEmployee Name : " + employee.getName() + "\nEntry Time : " + employee.getEnteyTiming()
				+ "\nTopic's : " + employee.getTopics() + "\nExit Time : " + employee.getExitTiming());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Company Name : " + employee2.getCOMPANYNAME() + "\nEmployee ID : " + employee2.getEmpId()
				+ "\nEmployee Name : " + employee2.getName() + "\nEntry Time : " + employee2.getEnteyTiming()
				+ "\nTopic's : " + employee2.getTopics() + "\nExit Time : " + employee2.getExitTiming());
	}

}
