package com.Oracle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstOracle
 */
@WebServlet("/oracle")
public class FirstOracle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("OracleController.doGet()");
		PrintWriter out = response.getWriter();
		out.println("<h1 style = 'color:red; text-align:center;'>Response from OracleServlet.... Accessed using FRD...</h1>");
		out.close();
	}

}
