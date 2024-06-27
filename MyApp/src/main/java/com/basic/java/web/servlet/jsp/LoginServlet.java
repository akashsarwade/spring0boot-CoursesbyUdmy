package com.basic.java.web.servlet.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

//	private UserValidationService service = new UserValidationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		String password = request.getParameter("password");
		request.setAttribute("password", password);

		// server it will redirect to the JSp
		request.getRequestDispatcher("/WEB-INF/View/login.jsp").forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String name=request.getParameter("name");
//		String password=request.getParameter("password");
//		
//		boolean isUservalid= service.isUserValid(name, password);
//
//			if(isUservalid) {
//				request.setAttribute("name",name);
//				request.setAttribute("password",password);
//				request.getRequestDispatcher("/WEB-INF/View/welcome.jsp").forward(request, response);
//
//			}
//			else {
//				request.setAttribute("Error message","Invalid Credentials");
//				request.getRequestDispatcher("/WEB-INF/View/login.jsp").forward(request, response);
//			}
//		
//		
//		request.setAttribute("name", request.getParameter("name"));
//		request.setAttribute("password", request.getParameter("password"));
//		request.getRequestDispatcher("/WEB-INF/View/welcome.jsp").forward(request, response);

//	}

}
