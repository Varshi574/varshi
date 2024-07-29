package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Process
 */
@WebServlet("/process")
public class Process extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("t1");
		int accountNumber = Integer.parseInt(a);
				try
		{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "system");
					PreparedStatement s = c.prepareStatement("select amount from bhavi where accno=?");
					s.setInt(1, accountNumber);

					ResultSet rs = s.executeQuery();
					PrintWriter pw = response.getWriter();
					if (rs.next()) {
						
						pw.println("<h1>");
						pw.println("the available balance is " + rs.getInt(1));
						pw.println("</h1>");
						pw.println("<a href='index.html'>click </a>");
					}
					else
					{
						pw.println("<h1>enter your bank account correctly</h1>");
						pw.println("<a href='index.html'>click </a>");
					}

				} catch (Exception e) {
					System.out.println(e);
				}

			}
		
	}
	

	

