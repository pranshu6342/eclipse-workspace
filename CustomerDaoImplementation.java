package com.testyantra.union.customerdao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

import com.testyantra.union.customerdto.CustomerDto;
import com.testyantra.union.exception.CustomerException;
import com.testyantra.union.exception.CustomerExceptionAController;
import com.testyantra.union.exception.InsufficientBalanceException;

@Repository
public class CustomerDaoImplementation implements CustomerDao {
	EntityManagerFactory factory;
	EntityManager manager;
	EntityTransaction transaction;
	String tempId;
	Double y;
	ArrayList<CustomerDto> list = new ArrayList();

	private void operation() {
		factory = Persistence.createEntityManagerFactory("Test");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
	}

	public void closeConnections() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
	}

	@Override
	public CustomerDto openAccount(String empId, String empName, String password, Long mobileNo, Double balance) {
		operation();
		CustomerDto dto = new CustomerDto();
		dto.setEmpId(empId);
		dto.setEmpName(empName);
		dto.setPassword(password);
		dto.setMobileNo(mobileNo);
		dto.setBalance(balance);
		dto.setBankAddress("BTM_Bangalore");
		dto.setBankContact("656-241-64");
		dto.setBankName("UNION BANK OF INDIA");
		dto.setIfsc("UBIN057498");
		manager.persist(dto);
		transaction.commit();
		closeConnections();
		return dto;
	}

	@Override
	public CustomerDto login(String empId, String password) {
		operation();
		tempId = empId;
		CustomerDto dto = manager.find(CustomerDto.class, empId);
		if (dto != null) {
			if (dto.getPassword().equals(password)) {
				closeConnections();
				return dto;
			} else {
				throw new CustomerException("Invalid Password");
			}

		} else {
			throw new CustomerException("Invalid Id");
		}

	}

	@Override
	public CustomerDto deposit(Double amount) {
		operation();
		CustomerDto dto2 = manager.find(CustomerDto.class, tempId);
		Double balance = dto2.getBalance();
		Double avBalance = balance + amount;
		dto2.setBalance(avBalance);
		manager.persist(dto2);
		CustomerDto dto = manager.find(CustomerDto.class, tempId);
		transaction.commit();
		closeConnections();
		return dto;
	}

	@Override
	public CustomerDto update(String empName) {
		operation();
		CustomerDto dto = manager.find(CustomerDto.class, tempId);
		dto.setEmpName(empName);
		manager.persist(dto);
		transaction.commit();
		closeConnections();
		return dto;
	}

//	@Override
//	public CustomerDto login(String empId, String password) {
//		operation();
//		tempId = empId;
//		CustomerDto dto = manager.find(CustomerDto.class, empId);
//		if (dto != null) {
//			if (dto.getPassword().equals(password)) {
//				closeConnections();
//				return dto;
//			} else {
//				throw new CustomerException("Invalid Password");
//			}
//
//		} else {
//			throw new CustomerException("Invalid Id");
//		}
//
//	}
	@Override
	public Double transferMoney() {
		return y;
	}

	@Override
	public CustomerDto tranfer(String empId, Double amount) {
		operation();
		y = amount;
		CustomerDto dto = manager.find(CustomerDto.class, tempId);
		if (dto.getBalance() >= amount) {
			Double loginUser = dto.getBalance() - amount;
			dto.setBalance(loginUser);
			manager.persist(dto);
			CustomerDto dto2 = manager.find(CustomerDto.class, empId);
			Double tranferUser = dto2.getBalance() + amount;
			dto2.setBalance(tranferUser);
			manager.persist(dto2);
			transaction.commit();
			closeConnections();
			return dto;
		} else {
			throw new InsufficientBalanceException("Insufficient Balance");
		}

	}

	@Override
	public CustomerDto getBalance() {
		operation();
		CustomerDto dto = manager.find(CustomerDto.class, tempId);
		closeConnections();
		return dto;
	}

	@Override
	public CustomerDto delete() {
		operation();
		CustomerDto dto = manager.find(CustomerDto.class, tempId);
		manager.remove(dto);
		transaction.commit();
		closeConnections();
		return dto;
	}

	@Override
	public CustomerDto searchPerticular(String empId) {
		operation();
		CustomerDto dto = manager.find(CustomerDto.class, empId);
		closeConnections();
		return dto;
	}

	@Override
	public ArrayList<CustomerDto> searchEntireData() {
		operation();
		String query = "from CustomerDto";
		Query createQuery = manager.createQuery(query);
		List resultList = createQuery.getResultList();
		list.addAll(resultList);
		return list;
	}
}
