package com.virtusa.numtoword.exceptions;

public class NumberExceedLimitException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NumberExceedLimitException(String message) {
		super(message);
	}
}
