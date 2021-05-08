package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

public class DbListener {
	static Connection connection = null;


	
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext context = arg0.getServletContext();
		try {
			System.out.println("++++++++++++++++++++++++++++++++++++++++");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cyberlink", "root", "root");
			context.setAttribute("connection", connection);
			System.out
					.println("-------CyberLink connection opened successfully------");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			System.out
					.println("-------CyberLink connection closed successfully------");

			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}


}
