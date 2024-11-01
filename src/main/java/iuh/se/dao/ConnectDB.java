package iuh.se.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private Connection con;
	
	public ConnectDB() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/vanPhong", "root", "sapassword");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {
		return this.con;
	}
	public void closeConnection() throws SQLException {
		con.close();
	}
}
