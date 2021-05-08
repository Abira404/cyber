package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Freelance;

public class DbQueries {

	public String saveFreelance(Freelance fl) {
		String result="Failed";
		String cname = fl.getCname();
		String jobdesc = fl.getJobdesc();
		String salary = fl.getSalary();
		String email = fl.getEmail();
		String contact = fl.getContact();
		System.out.println("[================]" + cname + jobdesc + salary + email + contact);
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = DbListener.getConnection();
			String query = "insert into freelance(cname,jobdesc,salary,email,contact) values (?,?,?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, cname);
			preparedStatement.setString(2, jobdesc);
			preparedStatement.setString(3, salary);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, contact);

			int i = preparedStatement.executeUpdate();

			if (i != 0) // Just to ensure data has been inserted into the
				// database
				result = "Success";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	

}
