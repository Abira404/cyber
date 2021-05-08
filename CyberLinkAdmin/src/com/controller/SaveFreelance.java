package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DbQueries;
import com.model.Freelance;

/**
 * Servlet implementation class SaveFreelance
 */
@WebServlet("/SaveFreelance")
public class SaveFreelance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveFreelance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DbQueries db = new DbQueries();
		String cname = request.getParameter("cname");
		String jobdesc = request.getParameter("jobdesc");
		String salary = request.getParameter("salary");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		Freelance fl = new Freelance(cname, jobdesc, salary, email, contact);
		String result = db.saveFreelance(fl);

		if (result.equalsIgnoreCase("Success")) {
			RequestDispatcher rd = request.getRequestDispatcher("freelance.jsp");
			request.setAttribute("msg", "Uploaded!");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			request.setAttribute("msg", "Failed!");
			rd.forward(request, response);
		}
	}

}
