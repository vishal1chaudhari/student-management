package project1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.dao.RegisterDao;
import project1.dao.RegisterDaoImpl;
import project1.model.Register;



/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studID=(Integer.parseInt(request.getParameter("studID")));
		String studName=request.getParameter("studName");
		String studDOB=request.getParameter("studDOB");
		String studDepart=request.getParameter("studDepart");
		String studYear=request.getParameter("studYear");
		String studMob=request.getParameter("studMob");
		String studUname=request.getParameter("studUname");
		String studPass=request.getParameter("studPass");
		
		
		//set value to model class
		Register robj=new Register(studID, studName, studDOB, studDepart, studYear, studMob, studUname, studPass);
		List<Register> lstreg=new ArrayList<Register>();
		lstreg.add(robj);
		
		//PrintWriter pw=response.getWriter();
		RegisterDao rdao=new RegisterDaoImpl();
		int i=rdao.create(lstreg);
//		RegisterDao rdao=new RegisterDaoImpl();
//		int i=rdao.create(lstreg);
		if(i>0) {
			//pw.print("<h1>Record Save..go to login page</h1>");
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
