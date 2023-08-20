package project1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
import project1.model.AdminRegister;
import project1.model.Register;

/**
 * Servlet implementation class ADisplayAllController
 */
@WebServlet("/AStudentDisplayAllController")
public class AStudentDisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AStudentDisplayAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminRegistDao ardao=new AdminRegistDaoImpl();
		List<Register> lstreg=ardao.AStudentDisplayAll();
		
//		HttpSession session=request.getSession();
//		session.setAttribute("data", lstreg);
//		response.sendRedirect("AStudentDisplayAll.jsp");
		
//		request.setAttribute("empList", alstreg);
//		RequestDispatcher view=request.getRequestDispatcher("listAll.jsp");
//		view.forward(request, response);
		
		PrintWriter pw=response.getWriter();
		pw.print("<table>");
	
		for(Register r:lstreg)
		{
			pw.println("<tr><td>"+r.getStudID()+"</td><td>"+r.getStudName()+"</td><td>"+r.getStudDOB()+"</td><td>"+r.getStudDepart()+"</td><td>"+r.getStudYear()+"</td><td>"+r.getStudMob()+"</td><td>"+r.getStudUname()+"</td><td>"+r.getStudPass()+"</td></tr>");
		}
		pw.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
