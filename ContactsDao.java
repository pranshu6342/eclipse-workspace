package com.technoelevate.contacts.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;
import com.technoelevate.contacts.dto.Contacts;

public class ContactsDao {
	EntityManagerFactory factory;
	EntityManager manager;
	EntityTransaction entityTransaction;
	Scanner sc = new Scanner(System.in);
	List resultList;
	IPhone iPhone = new IPhone();

	public void operation() {
		factory = Persistence.createEntityManagerFactory("contacts");
		manager = factory.createEntityManager();
		entityTransaction = manager.getTransaction();

	}

	public void show() {
		operation();
		String query = "from Contacts";
		Query createQuery = manager.createQuery(query);
		resultList = createQuery.getResultList();
		for (Object obj : resultList) {
			JOptionPane.showMessageDialog(null, obj+"\n");
		}
	}

	public void search() throws InterruptedException {
		operation();
		String search = JOptionPane
				.showInputDialog("(1)Search by Name   (2)Search by Phnone Number   (3)Search by Email Id");
		if (search.equals("1")) {
			String name = JOptionPane.showInputDialog("Please enter Name");
			entityTransaction.begin();
			Query createQuery = manager.createQuery("select phoneNumber from Contacts where name = '" + name + "'");
			resultList = createQuery.getResultList();
			String input = JOptionPane.showInputDialog(resultList + "\n(1)Call   (2)Text   (3)Back To Main Menu");
			if (input.equals("1")) {
				int time=1;
				for(int i=1;i<=time;i++) {
					if(time==10) {
						JOptionPane.showMessageDialog(null, "Not Responding Please Call After Some Time...");
					}
				JOptionPane.showMessageDialog(null, "Calling...");
				Thread.sleep(100);
				time++;
				}
			} else if (input.equals("2")) {
				JOptionPane.showInputDialog("Enter Your Massage Here and Press Enter to Send");
			} else if (input.equals("3")) {
				iPhone.start();
			}
		} else if (search.equals("2")) {
			String number = JOptionPane.showInputDialog("Please enter Phone Number");
			long num = Long.parseLong(number);
			entityTransaction.begin();
			Query createQuery = manager.createQuery("select phoneNumber from Contacts where phoneNumber = " + num);
			resultList = createQuery.getResultList();
			Query createQuery1 = manager.createQuery("select name from Contacts where phoneNumber = " + num);
			List resultList1 = createQuery1.getResultList();
			entityTransaction.commit();
			String input = JOptionPane.showInputDialog("Mob No : " + resultList + "\nName : " + resultList1
					+ "\n(1)Call   (2)Text   (3)Back To Main Menu");
			if (input.equals("1")) {
				JOptionPane.showMessageDialog(null, "Calling...");
			} else if (input.equals("2")) {
				JOptionPane.showInputDialog("Enter Your Massage Here and Press Enter to Send");
			} else if (input.equals("3")) {
				iPhone.start();
			}
		} else if (search.equals("3")) {
			String mail = JOptionPane.showInputDialog("Please enter Mail Id");
			entityTransaction.begin();
			Query createQuery = manager
					.createQuery("select phoneNumber from Contacts where phoneNumber = '" + mail + "'");
			resultList = createQuery.getResultList();
			entityTransaction.commit();
			String input = JOptionPane.showInputDialog(resultList + "\n(1)Call   (2)Text   (3)Back To Main Menu");
			if (input.equals("1")) {
				JOptionPane.showMessageDialog(null, "Calling...");
			} else if (input.equals("2")) {
				JOptionPane.showInputDialog("Enter Your Massage Here and Press Enter to Send");
			} else if (input.equals("3")) {
				iPhone.start();
			}
		}
	}

	public void operator() {
		operation();
		String input = JOptionPane
				.showInputDialog("(1)Add New Contact   (2)Delete Contact   (3)Update Contact   (4)Back To Main Menu");
		if (input.equals("1")) {
			String name = JOptionPane.showInputDialog("Please enter name");
			String mail = JOptionPane.showInputDialog("Please enter Mail_Id");
			String phone = JOptionPane.showInputDialog("Please enter Mobile Number");
			long mob = Long.parseLong(phone);
			Contacts date = new Contacts(mob, name, mail);
			entityTransaction.begin();
			manager.persist(date);
			entityTransaction.commit();
		} else if (input.equals("2")) {
			String number = JOptionPane.showInputDialog("Please enter Phone Number");
			long num = Long.parseLong(number);
			entityTransaction.begin();

			Query createQuery = manager.createQuery("delete Contacts where phoneNumber = " + num);
			int executeUpdate = createQuery.executeUpdate();
			System.out.println(executeUpdate + " row affected");

			entityTransaction.commit();
		} else if (input.equals("3")) {
			String update = JOptionPane
					.showInputDialog("What You Like to Update/n(1)Name   (2)Mail_Id   (3)Phone Number");
			if (update.equals("1")) {
				String name = JOptionPane.showInputDialog("Please enter Name");
				String number = JOptionPane.showInputDialog("Please enter Phone Number");
				long num = Long.parseLong(number);
				entityTransaction.begin();
				String query = "update Contacts set name= '" + name + "' where phoneNumber = " + num;
				Query createQuery = manager.createQuery(query);
				int executeUpdate = createQuery.executeUpdate();
				System.out.println(executeUpdate + " row affected");
				entityTransaction.commit();

			} else if (update.equals("2")) {
				String mail = JOptionPane.showInputDialog("Please enter Mail Id");
				String number = JOptionPane.showInputDialog("Please enter Phone Number");
				long num = Long.parseLong(number);
				entityTransaction.begin();
				String query = "update Contacts set emailID= '" + mail + "' where phoneNumber = " + num;
				Query createQuery = manager.createQuery(query);
				int executeUpdate = createQuery.executeUpdate();
				System.out.println(executeUpdate + " row affected");
				entityTransaction.commit();
			} else if (update.equals("3")) {
				String number = JOptionPane.showInputDialog("Please enter Phone Number");
				long num = Long.parseLong(number);
				String name = JOptionPane.showInputDialog("Please enter name");
				entityTransaction.begin();
				String query = "update Contacts set phoneNumber= '" + num + "' where name = " + name;
				Query createQuery = manager.createQuery(query);
				int executeUpdate = createQuery.executeUpdate();
				System.out.println(executeUpdate + " row affected");
				entityTransaction.commit();
			}
		}

	}
}
