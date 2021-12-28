package com.testyantra.union.customerdao;

import java.util.ArrayList;

import com.testyantra.union.customerdto.CustomerDto;

public interface CustomerDao {
	public CustomerDto openAccount(String empId,String empName,String password,Long mobileNo,Double balance);
	public CustomerDto login(String empId,String password);
	public CustomerDto deposit(Double amount);
	public CustomerDto update(String empName);
	public CustomerDto tranfer(String empId,Double amount);
	public CustomerDto getBalance();
	public CustomerDto delete();
	public Double transferMoney();
	public CustomerDto searchPerticular(String empId);
	public ArrayList<CustomerDto> searchEntireData();
	

}
