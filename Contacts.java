package com.technoelevate.contacts.dto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "phone_book")
public class Contacts implements Serializable {
	@Id
	private long phoneNumber;
	private String name;
	private String emailID;

	
	public Contacts() {}
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public Contacts(long phoneNumber, String name, String emailID) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.emailID = emailID;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Contacts [phoneNumber=" + phoneNumber + ", name=" + name + ", emailID=" + emailID + "]";
	}

}
