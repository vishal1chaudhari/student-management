package project1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import project1.dao.RegisterDao;
import project1.dao.RegisterDaoImpl;
import project1.model.Login;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studUname=request.getParameter("studUname");
		String studPass=request.getParameter("studPass");
		Login lobj=new Login(studUname, studPass);
		
		System.out.println("check pt1");
		
		RegisterDao rdao=new RegisterDaoImpl();
		String str=null;
		str=rdao.ValidateUser(lobj);
		HttpSession session=request.getSession();
		
		if(str.equals("Valid"))
		{
			System.out.println("Hii");
			session.setAttribute("msg",lobj);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			System.out.println("Bye...");
			session.setAttribute("msg",str);
			response.sendRedirect("Login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
