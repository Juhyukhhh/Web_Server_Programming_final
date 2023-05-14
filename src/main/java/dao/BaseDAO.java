package dao;

import java.sql.*;

public class BaseDAO {	
	final String JDBC_DRIVER = "org.h2.Driver";
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/jwbookdb";
	final String JDBC_USER = "jwbook";
	final String JDBC_PW = "1234";
	
	public Connection open() {
		Connection conn = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PW);
		} catch (Exception e) { e.printStackTrace(); }
		
		return conn;
	}
}
