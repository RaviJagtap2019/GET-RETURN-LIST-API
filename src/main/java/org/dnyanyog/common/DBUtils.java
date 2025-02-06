package org.dnyanyog.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	
	private static String url="jdbc:mysql://127.0.0.1:3306/school_management";
	private static String userName="root";
	private static String password="Ravi@2005";
	
	private static Connection connection;
	
	static 
	{
		try {
			connection=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static ResultSet executeSelectQuery(String query) throws SQLException {
		Statement statement=connection.createStatement();
		ResultSet result =statement.executeQuery(query);
		return result;
		
	}
}
