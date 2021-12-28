package com.testyantra.union.customerservice;

import java.util.ArrayList;

import com.testyantra.union.customerdto.CustomerDto;

public interface CustomerService {
	public CustomerDto openAccount(String empId,String empName, String password, Long mobileNo, Double balance);
	public CustomerDto login(String empId,String password);
	public CustomerDto deposit(Double amount);
	public CustomerDto update(String empName);
	public CustomerDto transfer(String empId,Double amount);
	public CustomerDto getBalance();
	public CustomerDto delete();
	public Double transferMoney();
	public CustomerDto searchPerticular(String empId);
	public ArrayList<CustomerDto> searchEntireData();
	
//	public CustomerDto openAccount(String name, String email, String password, double balance);
//
//	public CustomerDto setData(String name, String email, String password, double balance);
//
//	public CustomerDto deposite(String email, double amount);
//
//	public CustomerDto withdrawal(String email, double amount);
//
//	public CustomerDto login(String email, String password);
//
//	public CustomerDto getData(String email);

}
