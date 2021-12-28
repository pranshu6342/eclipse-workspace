package com.testyantra.union.customerservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testyantra.union.customerdao.CustomerDao;
import com.testyantra.union.customerdto.CustomerDto;

@Service
public class CustomerServiceImplementation implements CustomerService {
	@Autowired
	CustomerDao dao;

	@Override
	public CustomerDto openAccount(String empId, String empName, String password, Long mobileNo, Double balance) {

		return dao.openAccount(empId, empName, password, mobileNo, balance);
	}

	@Override
	public CustomerDto login(String empId, String password) {

		return dao.login(empId, password);
	}

	@Override
	public CustomerDto deposit(Double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}

	@Override
	public CustomerDto update(String empName) {
		// TODO Auto-generated method stub
		return dao.update(empName);
	}

	@Override
	public CustomerDto transfer(String empId, Double amount) {
		// TODO Auto-generated method stub
		return dao.tranfer(empId, amount);
	}

	@Override
	public CustomerDto getBalance() {
		// TODO Auto-generated method stub
		return dao.getBalance();
	}

	@Override
	public CustomerDto delete() {
		// TODO Auto-generated method stub
		return dao.delete();
	}

	@Override
	public CustomerDto searchPerticular(String empId) {
		// TODO Auto-generated method stub
		return dao.searchPerticular(empId);
	}

	@Override
	public ArrayList<CustomerDto> searchEntireData() {
		// TODO Auto-generated method stub
		return dao.searchEntireData();
	}

	@Override
	public Double transferMoney() {
		// TODO Auto-generated method stub
		return dao.transferMoney();
	}

//	@Override
//	public CustomerDto openAccount(String name, String email, String password, double balance) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public CustomerDto setData(String name, String email, String password, double balance) {
//		return dao.setData(name,email,password,balance);
//	}
//
//	@Override
//	public CustomerDto deposite(String email, double balance) {
//		
//		return dao.deposite(email,balance);
//	}
//
//	@Override
//	public CustomerDto withdrawal(String email, double amount) {
//		
//		return dao.withdrawal(email,amount);
//	}
//
//	@Override
//	public CustomerDto login(String email, String password) {
//		// TODO Auto-generated method stub
//		return dao.login(email,password);
//	}
//
//	@Override
//	public CustomerDto getData(String email) {
//		// TODO Auto-generated method stub
//		return dao.getData(email);
//	}

}
