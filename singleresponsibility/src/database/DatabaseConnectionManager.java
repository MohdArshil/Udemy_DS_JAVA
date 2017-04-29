package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnectionManager {

	private Connection conn;

	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

	private DatabaseConnectionManager() {

	}

	public static DatabaseConnectionManager getManagerInstance() {
		return connectionInstance;
	}


	public void connect() throws SQLException {
		conn = DriverManager.getConnection("...");
		System.out.println("Established Database Connection...");
	}

	public Connection getConnectionObject() {
		return conn;
	}

	public void disconnect() throws SQLException {
		conn.close();
		System.out.println("Disconnected from Database...");
	}
}