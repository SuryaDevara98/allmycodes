package jdbcadvancejava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class StoredProcedure {

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

			String query = "{CALL getTraineeName(?)} ";
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter any character");
			// String character = sc.nextLine();

			CallableStatement cs = con.prepareCall(query);
			cs.setString(1, sc.nextLine());

			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				String name = rs.getString("trainee_name");
				System.out.println("name is : " + name);
			}
			con.close();

		} catch (Exception e) {

		}
	}

}
