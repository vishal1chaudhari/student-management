package project1.controller;

import java.io.IOException;
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
 * Servlet implementation class AdminStudentSearchController
 */
@WebServlet("/AdminStudentSearchController")
public class AdminStudentSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminStudentSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strRegNo=request.getParameter("RegNo");
		int RegNo=Integer.parseInt(strRegNo);
		
		AdminRegistDao ardao=new AdminRegistDaoImpl();
		List<Register> lstreg=ardao.search(RegNo);
		Register r =lstreg.get(0);
		
		HttpSession session=request.getSession();
		session.setAttribute("data", r);
		response.sendRedirect("AdminStudentSearch.jsp");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
