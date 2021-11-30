package com.technoelevate.contacts.dao;

import javax.swing.JOptionPane;

public class IPhone {

	public static void start() throws InterruptedException {
		ContactsDao contactsDao = new ContactsDao();
		String input = JOptionPane.showInputDialog("(1)Show All Contact's   (2)Search Contacts   (3)Operator");
		if (input.equals("1")) {
			contactsDao.show();
		} else if (input.equals("2")) {
			contactsDao.search();
		} else if (input.equals("3")) {
			contactsDao.operator();
		}
	}

	public static void main(String[] args) throws InterruptedException {
               start();  
	}
}
