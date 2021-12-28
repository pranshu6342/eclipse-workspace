package com.testyantra.union.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionAController {
	@ExceptionHandler(CustomerException.class)
	public String exthrow(HttpServletRequest request,CustomerException exception) {
		request.setAttribute("errMsg",exception.getMessage());
		return "login";
	}
	@ExceptionHandler(InsufficientBalanceException.class)
	public String exthrowInsufficient(HttpServletRequest request,CustomerException exception) {
		request.setAttribute("sms",exception.getMessage());
		return "transferData";
	}
}
