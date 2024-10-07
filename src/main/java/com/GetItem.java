package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class GetItem
 */
public class GetItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=request.getSession(false);
		PrintWriter pw=response.getWriter();
		String s1=(String)hs.getAttribute("book1");
		String s2=(String)hs.getAttribute("book2");
		String s3=(String)hs.getAttribute("book3");
		 pw.print("<html><body bgcolor=red text=white><center>");
		 pw.print("<h1>Selected Bokks</h1>");
		 
		if(s1!=null)
		{
			pw.println(s1+"<br>");
		}
		if(s2!=null)
		{
			pw.println(s2+"<br>");
		}
		if(s3!=null)
		{
			pw.println(s3+"<br>");
		}
		pw.print("</center></body></html>");

	}

}
