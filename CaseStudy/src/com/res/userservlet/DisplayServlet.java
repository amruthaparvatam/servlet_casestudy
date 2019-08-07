package com.res.userservlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.model.Athelete;
import com.res.userservice.DisplayService;
import com.res.userservice.UserService;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		DisplayService displayService = new DisplayService();
		
		

		ArrayList<Athelete> athelets = displayService.displayUserDetails();;
		
		request.setAttribute("atheletes", athelets);
		
		/*request.setAttribute("athleteId", atheletes);
		request.setAttribute("athleteName", Name);
		request.setAttribute("athleteGender", Gender);
		request.setAttribute("athleteCategory", Category);
		request.setAttribute("athleteEmail", Email);
		request.setAttribute("athleteMobile", Mobile);*/
		
			
		RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
		
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
