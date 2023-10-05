package jdbcadvancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingJdbc {

	public static void main(String[] args) {
		try {

			// load the driver
			Class.forName("com.mysql.jdbc.Driver");

			// get the connection
			// jdbc:mysql://localhost:3306?user=root&password=Prasanna@98
			String url = "jdbc:mysql://localhost:3306/tecm18";
			String username = "root";
			String password = "Prasanna@98";
			// String tableName = "details";

			String query = "insert into details_02 values(12,'Suryadevaraprasanna',4000,10);";
			// String query = "CREATE TABLE " + tableName
//					+ "(course_id int PRIMARI KEY AUTO INCREMENT,course_name varchar(15),trainee_name varchar(15),course_duration int)";

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection is established");

			// pass teh query
			Statement statement = con.createStatement();

			// proces teh result
			int rowsAffected = statement.executeUpdate(query);
			if (rowsAffected >= 0) {
				System.out.println("Inserted data successfully");
				System.out.println("rous afftected is  :" + rowsAffected);
			} else {
				System.out.println("there is error while inserting");
			}

			con.close();
			System.out.println("conn closed");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
