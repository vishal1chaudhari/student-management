package project1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import project1.dao.AdminRegistDao;
import project1.dao.AdminRegistDaoImpl;
import project1.dao.RegisterDao;
import project1.dao.RegisterDaoImpl;
import project1.model.AdminLogin;
import project1.model.Login;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("UserName");
		String Password=request.getParameter("Password");
		AdminLogin alobj=new AdminLogin(UserName,Password);
		
		
		AdminRegistDao ardao=new AdminRegistDaoImpl();
		String str=null;
		str=ardao.validateUser(alobj);
		HttpSession session=request.getSession();
		
		if(str.equals("valid"))
		{
			System.out.println("Hii");
			session.setAttribute("msg",alobj);
			request.getSession().setAttribute("UserName", UserName);
			response.sendRedirect("AdminDashboard.jsp");
		}
		else
		{
			System.out.println("Bye...");
			session.setAttribute("msg",str);
			response.sendRedirect("AdminLogin.jsp");
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
