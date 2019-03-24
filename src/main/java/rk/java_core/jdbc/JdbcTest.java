package rk.java_core.jdbc;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		System.out.println("jsbc test work");

		try {
			//Class.forName("com.mysql.jdbc.Driver"); // old
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
