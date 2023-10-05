package jdbcadvancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertWhileRuntime {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			// jdbc:mysql://localhost:3306?user=root&password=Prasanna@98
			String url = "jdbc:mysql://localhost:3306/tecm18";
			String username = "root";
			String password = "Prasanna@98";
			// String tableName = "details";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection is established");
			System.out.println("--------------------------------");

			String query = "insert into details_02 values(?,?,?,?);";

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter course_Id");
			int courseId = sc.nextInt();
			sc.nextLine();

			System.out.println("Please enter course_Name");
			String courseName = sc.nextLine();

			System.out.println("Please enter your age");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("Please enter your city");
			String city = sc.nextLine();

			// id, name,age,city
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, courseId);
			ps.setString(2, courseName);
			ps.setInt(3, age);
			ps.setInt(3, age);
			ps.setString(4, city);

			int rowsAffected = ps.executeUpdate();
			if (rowsAffected >= 0) {
				System.out.println("values inserted succwssfully with rows : " + rowsAffected);
			} else {
				System.out.println("error in inserting data in to teh table ");
			}

			con.close();
		} catch (Exception e) {

		}
	}

}
