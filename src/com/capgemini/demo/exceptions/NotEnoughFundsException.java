package com.capgemini.demo.exceptions;

@SuppressWarnings("serial")
public class NotEnoughFundsException extends Exception{

	public NotEnoughFundsException(String message) {
		super(message);
	}

}
