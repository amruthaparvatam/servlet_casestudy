package com.res.userservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.userservice.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		
		int Id=Integer.parseInt(request.getParameter("id"));
		//pw.println(Id);
		
		String Name=request.getParameter("name");
		//pw.println(Name);
		
		String Gender=request.getParameter("r1");	
		//pw.println(Gender);
		
		String Category=request.getParameter("point");	
		//pw.println(Category);
		
		String Email=request.getParameter("email");	
		//pw.println(Email);
		
		int Mobile=Integer.parseInt(request.getParameter("num"));	
		//pw.println(Mobile);
		
		UserService userService = new UserService();
		
		userService.addUserDetails(Id,Name,Gender,Category,Email,Mobile);
		
		request.setAttribute("athleteId", Id);
		request.setAttribute("athleteName", Name);
		request.setAttribute("athleteGender", Gender);
		request.setAttribute("athleteCategory", Category);
		request.setAttribute("athleteEmail", Email);
		request.setAttribute("athleteMobile", Mobile);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("user.jsp");
		dispatcher.forward(request, response);
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
