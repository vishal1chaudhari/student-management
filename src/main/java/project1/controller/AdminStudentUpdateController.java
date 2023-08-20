package project1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
 * Servlet implementation class AdminStudentUpdateController
 */
@WebServlet("/AdminStudentUpdateController")
public class AdminStudentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminStudentUpdateController() {
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
		
		Register robj=new Register(studID, studName, studDOB, studDepart, studYear, studMob, studUname, studPass);
		List<Register> lstreg=new ArrayList<Register>();
		lstreg.add(robj);
		
		AdminRegistDao ardao=new AdminRegistDaoImpl();
		int i=ardao.update(lstreg);
		
		HttpSession session=request.getSession();
		session.setAttribute("data", lstreg);
		PrintWriter pw=response.getWriter();
		if(i>0)
		{
			response.sendRedirect("AdminStudentUpdate.jsp");
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
