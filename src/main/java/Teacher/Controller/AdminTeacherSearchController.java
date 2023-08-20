package Teacher.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Teacher.Dao.TeacherDao;
import Teacher.Dao.TeacherDaoImpl;
import project1.model.Teacher;

/**
 * Servlet implementation class AdminTeacherSearchController
 */
@WebServlet("/AdminTeacherSearchController")
public class AdminTeacherSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminTeacherSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Tid=Integer.parseInt(request.getParameter("Tid"));
		TeacherDao tdao=new TeacherDaoImpl();
		List<Teacher> tlist= tdao.searchTeacher(Tid);
		Teacher tobj=tlist.get(0);
		
		HttpSession session=request.getSession();
		session.setAttribute("data", tobj);
		response.sendRedirect("AdminTeacherSearch.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
