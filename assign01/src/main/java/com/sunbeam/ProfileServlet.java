package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profileServlet")
public class ProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Student Profile</title>");
		out.println("</head>");
		out.println("<center><body>");
		out.println("<h1>Student Profile</h1>");
		out.println("<div>First Name : Vinay</div></br>");
		out.println("<div>Last Name : Patil</div></br>");
		out.println("<div>Qualification : MCA</div></br>");
		out.println("<div>College : AESIMR college,Pune</div></br>");
		out.println("<div>DOB : 09/09/2001</div></br>");
		out.println("</body></center>");
		out.println("</html>");
		
	}
	
}
