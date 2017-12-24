package com.pratik.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hits")
public class NoOfHitCountServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public NoOfHitCountServlet() {
        super();
        int count=0;
        		//for number of objects created
        		System.out.println("Objects Created: "+count);
        		count++;
    }

    //get() method
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
			//get the servlet context
			//ServletContext context = getServletConfig().getServletContext();
		ServletContext context =getServletContext();
				//count the number of hits 
				int count = (Integer)context.getAttribute("count");
				out.println("<h1>Hit Count :"+count+"</h1>");
				//	out.println("<h1>Hit Count :"+context.getAttribute("count")+"</h1>");
		
		
	}//doGet(-,-) ends

}//class close
