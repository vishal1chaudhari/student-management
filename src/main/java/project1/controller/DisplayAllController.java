package project1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.dao.RegisterDao;
import project1.dao.RegisterDaoImpl;
import project1.model.Register;

/**
 * Servlet implementation class DisplayAllController
 */
@WebServlet("/DisplayAllController")
public class DisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegisterDao rdao=new RegisterDaoImpl();
		List<Register> lstreg=rdao.displayAll();
		/*
		HttpSession session=request.getSession();
		session.setAttribute("data", lstreg);
		response.sendRedirect("liatAll.jsp");*/
		
		request.setAttribute("empList", lstreg);
		RequestDispatcher view=request.getRequestDispatcher("AdminStudent.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
