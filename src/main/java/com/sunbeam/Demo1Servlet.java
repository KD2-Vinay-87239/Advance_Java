
//Servlet using anodations

package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		value="/demo1",
		initParams= {
				@WebInitParam(name="background",value="yellow"),
				@WebInitParam(name="addr",value="Pune,India")
		},
		loadOnStartup=3
		)

public class Demo1Servlet extends HttpServlet{
	private String color="";
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		color=config.getInitParameter("background");
		System.out.println("Demo1Servelet.init() called....");
	}
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("Demo1Servelet.doget() called....");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Demo1</title>");
		out.println("</head>");
		out.printf("<body bgcolor='%s'>\n", color);
		out.println("<h1>Information</h1>");
		out.println("<h3>Name: Nilesh Ghule</h3>");
		out.println("<h3>Company: Sunbeam</h3>");
		String addr = this.getInitParameter("addr");
		out.printf("<h3>Address: %s</h3>", addr);
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	public void destroy() {
		System.out.println("Demo1Servlet.destroy() called.");
	}
}

