package project1.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.dao.AdminRegistDao;
import project1.dao.AdminRegistDaoImpl;
import project1.model.AdminRegister;

/**
 * Servlet implementation class AdminRegController
 */
@WebServlet("/AdminRegController")
public class AdminRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int AdminNo=(Integer.parseInt(request.getParameter("AdminNo")));
		String CustName=request.getParameter("CustName");
		String UserName=request.getParameter("CustName");
		String Password=request.getParameter("Password");
		
		AdminRegister aobj=new AdminRegister(AdminNo, CustName, UserName, Password);
		List<AdminRegister> alstreg=new ArrayList<AdminRegister>();
		alstreg.add(aobj);
		
		AdminRegistDao ardao=new AdminRegistDaoImpl();
		int i=ardao.create(alstreg);
		
		if(i>0)
		{
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
