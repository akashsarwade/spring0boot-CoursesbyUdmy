package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value = req.getParameter("name");
		String htmlResp = "<html><h3>Welcome to servlet/h3></html>";
		PrintWriter writer = resp.getWriter();
		writer.print("Welcomr to doGet Method");
		writer.write(htmlResp + " " + value);
	}

}
