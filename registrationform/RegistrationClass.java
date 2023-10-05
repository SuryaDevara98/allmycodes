package com.jsp.registrationform;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationClass 
{
	String url ="jdbc:mysql://localhost:3306?user=root&password=Prasanna@98";
	
	public void register() throws SQLException
	{
		String call ="{call tecm21.registrationform(?,?,?,?,?,?)}";
		
		Connection connection = DriverManager.getConnection(url);
		
		CallableStatement callablestatement = connection.prepareCall(call);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you First Name");
		callablestatement.setString(1,sc.next());
		
		System.out.println("Enter your Last Name: ");
		callablestatement.setString(2,sc.next());
		
		System.out.println("Enter your Roll NO: ");
		callablestatement.setInt(3,sc.nextInt());
		
		System.out.println("Enter your Email: ");
		callablestatement.setString(4,sc.next());
		
		System.out.println("Enter your Password: ");
		String pass= sc.next();
		callablestatement.setString(5,pass);
		
		System.out.println("Re-enter your Password: ");
		String cpass=sc.next();
		callablestatement.setString(6,cpass);
		
		if(pass.equals(cpass))
		{
			System.out.println("Registered successfully!!!!");
			callablestatement.executeUpdate();
			connection.close();
		}
		else
		{
			System.out.println("check your given password and confirmation password are same!!!!");
		}
		
		
	}
	public void Login()
	{
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			String call="{call tecm21.loginafterregister(?,?)}";
			
			CallableStatement callableStatement=connection.prepareCall(call);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter you email");
			String email = sc.next();
			callableStatement.setString(1,email);
			
			System.out.println("Enter you password");
			String password=sc.next();
			callableStatement.setString(2,password);
			
			if(email.equals(password))
			{
				System.out.println("login was successfull....");
			}
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
}
