package com.technoelevate;

public class InvalidCredentialsException extends RuntimeException {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Provided login_Id and Password are Invalid";
	}

}
