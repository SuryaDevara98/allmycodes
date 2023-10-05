package com.te.customexceptions;

public class InvalidInputException extends RuntimeException {

	public InvalidInputException(String message) {
		super(message);
	}

}
