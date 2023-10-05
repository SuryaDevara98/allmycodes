package jdbcadvancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// jdbc:mysql://localhost:3306?user=root&password=Prasanna@98
			String url = "jdbc:mysql://localhost:3306/tecm18";
			String username = "root";
			String password = "Prasanna@98";
			String tableName = "details";

			String query = "CREATE TABLE details_02(trainee_id INT PRIMARY KEY auto_increment, trainee_name VARCHAR(20),trainee_age int,trainee_city VARCHAR(20) );";
			// String query = "CREATE TABLE " + tableName
//					+ "(course_id int PRIMARI KEY AUTO INCREMENT,course_name varchar(15),trainee_name varchar(15),course_duration int)";

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection is established");
			Statement statement = con.createStatement();
			int rowsAffected = statement.executeUpdate(query);
			if (rowsAffected >= 0) {
				System.out.println("Table created with :" + tableName);
			}
			con.close();
			System.out.println("conn closed");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
