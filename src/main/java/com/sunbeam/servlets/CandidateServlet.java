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

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.entities.Candidate;
import com.sunbeam.entities.User;

@WebServlet("/candidate")
public class CandidateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String party=req.getParameter("party");
		int votes;
		
		Candidate c=new Candidate(0,name,party,0);
		PrintWriter	out=resp.getWriter();
			try(CandidateDao u1=new CandidateDaoImpl()){
				int a=u1.save(c);
				if(a!=0) {
					out.println("<html>");
					out.println("<head>");
					out.println("<title>New Candidate Register</title>");
					out.println("</head>");
					// get bgcolor  from ctx param and display it
					ServletContext color = this.getServletContext();
					String bgColor = color.getInitParameter("color.bgcolor");
					out.printf("<body style='background-color:%s'>",bgColor);
					out.println("<h2>Login Successful!!</h2>");
					out.println("<p><a href='index.html'>Login </a></p>");
//					out.println("<p><a href='candidate.html'>New Candidate </a></p>");
					out.println("</body>");
					out.println("</html>");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		
		
	}

	
}
