package com.res.userservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.userservice.DeleteService;
import com.res.userservice.UpdateService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter pw=response.getWriter();

		//int Id=Integer.parseInt(request.getParameter("aid"));
		

		//int Mobile=Integer.parseInt(request.getParameter("mobile"));	
		
		//UpdateService updateService = new UpdateService();
		
		//updateService.updateUserDetails(Id,Mobile);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw=response.getWriter();
		
		int Id=Integer.parseInt(request.getParameter("aid"));
		//pw.println(Id);
		
		int Mobile=Integer.parseInt(request.getParameter("mobile"));
		//pw.println(Mobile);
		
		UpdateService updateService = new UpdateService();
		
		updateService.updateUserDetails(Id,Mobile);
	}

}
