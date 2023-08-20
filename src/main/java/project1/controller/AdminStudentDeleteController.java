package project1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import project1.dao.AdminRegistDao;
import project1.dao.AdminRegistDaoImpl;
import project1.model.Register;

/**
 * Servlet implementation class AdminStudentDeleteController
 */
@WebServlet("/AdminStudentDeleteController")
public class AdminStudentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminStudentDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studID=Integer.parseInt(request.getParameter("studID"));
		
		AdminRegistDao ardao=new AdminRegistDaoImpl();
		List<Register> lstreg=ardao.search(studID);
		Register r=lstreg.get(0);
		
		HttpSession session=request.getSession();
		session.setAttribute("data", r);
		response.sendRedirect("AdminStudentDelete.jsp");
		
	}
//		PrintWriter pw=response.getWriter();
//		int i=ardao.delete(lstreg);
//		
//		
//        if(i>0) {
//			pw.print("<h1>record deleted </h1>");
//		    HttpSession session=request.getSession();
//			session.setAttribute("data", i);
//        	HttpSession session=request.getSession();
//        	session.setAttribute("data", r);
//			response.sendRedirect("AdminStudentDeleteConform.jsp");
//		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
