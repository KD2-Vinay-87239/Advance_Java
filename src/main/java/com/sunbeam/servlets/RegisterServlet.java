package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.entities.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String first_name=req.getParameter("first_name");
		String last_name=req.getParameter("last_name");
		String email=req.getParameter("email");
		String password=req.getParameter("passwd");
		String date=req.getParameter("birth");
		Date birth=Date.valueOf(date);
		String role;
		int status;
		
		User u=new User(0,first_name,last_name,email,password,birth,0,"voter");
		PrintWriter	out=resp.getWriter();
			try(UserDao u1=new UserDaoImpl()){
				int a=u1.save(u);
				if(a!=0) {
					out.println("<html>");
					out.println("<head>");
					out.println("<title>New User Register</title>");
					out.println("</head>");
					ServletContext color = this.getServletContext();
					String bgColor = color.getInitParameter("color.bgcolor");
					out.printf("<body style='background-color:%s'>",bgColor);
					out.println("<h2>Login Successful!!</h2>");
					out.println("<p><a href='index.html'>Login </a></p>");
					out.println("<p><a href='candidate.html'>New Candidate </a></p>");
					out.println("</body>");
					out.println("</html>");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		
		
	}
}
