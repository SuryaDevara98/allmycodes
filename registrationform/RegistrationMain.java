package com.jsp.registrationform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;



public class RegistrationMain {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException 
	{
		RegistrationClass register = new RegistrationClass();
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("Enter 1 for Registration");
		System.out.println("Enter 2 for Login");
		int key = Integer.parseInt(read.readLine());
		
		switch (key) 
		{
		case 1:
			
			try 
			{
				register.register();
				System.out.println("***********************************************");
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			
			break;
			
		case 2:
			register.Login();
			System.out.println("************************************************");
			break;
		
		default:System.out.println("Enter your choice");
			break;
		}
		
		}
		while(1==1);
	}

}
