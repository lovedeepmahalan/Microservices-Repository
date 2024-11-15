package com.URLReWriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstUrlReWriting extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		String uname = request.getParameter("name");
		out.println("<body align='center'>");
		out.println("<h1 style='color:red; text-align:center;'>Welcome to pwski....</h1>");
		String url="./secondurl"+ "?name="+uname;
		String encodeURL = response.encodeURL(url);
		System.out.println(encodeURL);
		response.sendRedirect(encodeURL);
		
		//out.println("<a href=./secondurl?name="+uname+">CLICK HERE TO GET THE NAME</a>");
		out.println("</body>");
		out.close();	
	}

}