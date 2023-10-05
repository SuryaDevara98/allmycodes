package com.technoelevate.superheros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SuperHeroDAO {

	static Connection con = ConnectionProvider.provideConnection();

	public static boolean insertHero(SuperHero superhero) {
		boolean isInserted = false;

		try {
			String query = "insert into superheros(superName,superPower,weapon) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, superhero.getSuperName());
			ps.setString(2, superhero.getSuperPower());
			ps.setString(3, superhero.getWeapon());

			int rows = ps.executeUpdate();
			if (rows > 0) {
				isInserted = true;
				System.out.println("super hero with name : " + superhero.getSuperName() + " is inserted");
			} else {
				System.out.println(
						"the given superhero name " + superhero.getSuperName() + "is not qualified as super hero");
			}
			return isInserted;

		} catch (Exception e) {
			e.printStackTrace();
			return isInserted;
		}

	}

	public static void updateHero(SuperHero superhero) {
		try {
			String query = "update SuperHeros set weapon=? where superId=?";

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the updated weapon name:");

			String updatedweaponName = scan.nextLine();

			System.out.println("Please enter the superId ");

			int sid = Integer.parseInt(scan.nextLine());

			// Get the PreparedStatement Object and set the data

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, updatedweaponName);

			pstmt.setInt(2, sid);

			int rowsAffected = pstmt.executeUpdate();

			System.out.println("Number of rows affected : " + rowsAffected);
			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void deleteHero(SuperHero superhero) {

		try {
			String query = "delete from SuperHeros where superId=?";

			Scanner scan = new Scanner(System.in);

			System.out.println("Please enter the superId ");

			int sid = scan.nextInt();

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, sid);

			int rowsAffected = pstmt.executeUpdate();

			System.out.println("Number of rows affected : " + rowsAffected);

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void displayHero(SuperHero superhero) {
		try {
			String query = "SELECT * FROM SuperHeros Where superId = ?";

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the superId : ");

			int superId = scan.nextInt();

			// Get the PreparedStatement Object and set the data
			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, superId);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int sid = rs.getInt(1);
				String superName = rs.getString("superName");
				String superPower = rs.getString(3);
				String weapon = rs.getString("weapon");

				System.out.println(
						superId + " -------- " + superName + " -------- " + superPower + " -------- " + weapon);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
