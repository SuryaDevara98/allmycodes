package jdbcadvancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchUsingRuntime {

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

			String query = "SELECT * FROM tecm18.details_02 WHERE trainee_name REGEXP ?; ";
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter any character");
			String character = sc.nextLine();

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, character);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int courseId = rs.getInt(1);
				String courseName = rs.getString(2);
				int age = rs.getInt("trainee_age");
				String city = rs.getString("trainee_city");
				System.out.println(courseId + "-----" + courseName + "-----" + age + "-----" + city);
			}
			con.close();

		} catch (Exception e) {

		}
	}

}
