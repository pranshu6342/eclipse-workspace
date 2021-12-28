package com.testyantra.union.customercontroller;

import java.util.ArrayList;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.testyantra.union.customerdao.CustomerDao;
import com.testyantra.union.customerdto.CustomerDto;
import com.testyantra.union.customerservice.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService service;

	@GetMapping("/openVenktesh")
	public String open() {
		return "showData";
	}

	@GetMapping("/ragisration{id}")
	public String openAccount() {
		return "ragistration";
	}

	@GetMapping("/main")
	public String main() {
		return "mainMenu";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginData(ModelMap map, String empId, String password, HttpServletRequest request) {
		CustomerDto dto = service.login(empId, password);
		if (dto != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginKey", dto);
			session.setMaxInactiveInterval(300);
			map.addAttribute("msg", dto.getEmpName());
			return "mainMenu";
		} else {
			map.addAttribute("errMsg", "Invalid password!!!Please login once again");
			return "login";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Logged out successfully");
		return "login";
	}

	@PostMapping("/ragisration")
	public String openAccount(ModelMap map, @RequestParam String empId, String empName, String password, long mobileNo,
			Double balance) {
		CustomerDto dto = service.openAccount(empId, empName, password, mobileNo, balance);
		map.addAttribute("dtoKey", dto);
		return "ragistrationStatus";
	}

	@GetMapping("/deposit")
	public String deposit() {
		return "deposit";
	}

	@PostMapping("/deposit")
	public String deposit(@SessionAttribute(name = "loginKey", required = false) CustomerDto customerDto, ModelMap map,
			double amount) {
		if (customerDto != null) {
			CustomerDto dto = service.deposit(amount);
			map.addAttribute("depoKey", dto);
			map.addAttribute("msg", "Deposit Successfull");
			return "mainMenu";
		} else {
			map.addAttribute("msg", "Your session has timed out..!!");
			return "login";
		}
	}

	@GetMapping("/update")
	public String update() {
		return "update";
	}

	@PostMapping("/update")
	public String update(ModelMap map, @RequestParam String empName) {
		CustomerDto update = service.update(empName);
		map.addAttribute("upKey", update);
		return "updateDetails";
	}

	@GetMapping("/transfer")
	public String transfer() {
		return "transfer";
	}

	@PostMapping("/transfer")
	public String transfer(ModelMap map, @RequestParam String empId, double amount) {
		CustomerDto transfer = service.transfer(empId, amount);
		if (transfer != null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");
			EntityManager manager = factory.createEntityManager();
			CustomerDto dto = manager.find(CustomerDto.class, empId);
			map.addAttribute("tKey", transfer);
			map.addAttribute("name", dto);
			Double transferMoney = service.transferMoney();
			map.addAttribute("money",transferMoney);
			return "transferData";
		} else {
			map.addAttribute("sms", "Insufficient Balance");
			return "transferData";
		}
	}

	@GetMapping("/check")
	public String check(ModelMap map) {
		CustomerDto dto = service.getBalance();
		map.addAttribute("data", dto);
		return "showData";
	}

	@GetMapping("/delete")
	public String delete(ModelMap map) {
		CustomerDto dto = service.delete();
		map.addAttribute("data", dto);
		return "delete";
	}

	@GetMapping("/searchPerticular")
	public String searchPerticular() {
		return "searchP";
	}

	@PostMapping("/searchPerticular")
	public String searchPerticular(ModelMap map, @RequestParam String empId) {
		CustomerDto dto = service.searchPerticular(empId);
		map.addAttribute("periticularData", dto);
		return "searchPerticular";
	}

	@GetMapping("/searchEntireData")
	public String searchEntireData(ModelMap map) {
		ArrayList<CustomerDto> searchEntireData = service.searchEntireData();
		map.addAttribute("searchEntireData", searchEntireData);
		return "searchEntireData";
	}

}
