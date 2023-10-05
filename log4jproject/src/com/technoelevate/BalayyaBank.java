package com.technoelevate;

import org.apache.log4j.Logger;

public class BalayyaBank {
	private String name;
	private double bal;
	private String userName;
	private String password;

	private static final Logger logger = Logger.getLogger(BalayyaBank.class.getName());

	public BalayyaBank(String name, double bal, String userName, String password) {

		this.name = name;
		this.bal = bal;
		this.userName = userName;
		this.password = password;
	}

	public void deposit(String userName, String password, double amount) throws InvalidCredentialsException {
		if (!this.name.equals(userName) && !this.password.equals(password)) {
			throw new InvalidCredentialsException();
		} else {
			this.bal += amount;
			System.out.println(" INR " + amount + " has been deposited. Tota bal available is : " + this.bal);
		}
	}

	public void withdraw(String userName, String password, double amount) throws InvalidCredentialsException {

		try {
			logger.info("enter into try block in withdraw method s");
			if (!this.name.equals(userName) && !this.password.equals(password)) {
				throw new InvalidCredentialsException();
			} else {
				if (this.bal < amount) {
					System.out.println("mr." + this.name
							+ " you are not having enough balance in your acc to proceed trasaction ");
				} else {
					this.bal -= amount;
					System.out.println("you have toatl balance of rupees :" + this.bal);
				}

			}
		} catch (Exception e) {
			logger.warn("from catch exception in withdraw method");

		} finally {
			logger.fatal("from final in  method");
			System.out.println("from finalky blk");
		}

	}

	public String getName() {
		return name;
	}

	public double getBal() {
		return bal;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
