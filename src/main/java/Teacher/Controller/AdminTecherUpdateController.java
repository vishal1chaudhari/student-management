package Teacher.Controller;

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

import Teacher.Dao.TeacherDao;
import Teacher.Dao.TeacherDaoImpl;
import project1.model.Teacher;

/**
 * Servlet implementation class AdminTecherUpdateController
 */
@WebServlet("/AdminTecherUpdateController")
public class AdminTecherUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminTecherUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Tid=(Integer.parseInt(request.getParameter("Tid")));
		String Tname=request.getParameter("Tname");
		String Tmob=request.getParameter("Tmob");
		String Tdepart=request.getParameter("Tdepart");
		String Tdegree=request.getParameter("Tdegree");
		String Tuname=request.getParameter("Tuname");
		String Tpass=request.getParameter("Tpass");
		
		Teacher tobj=new Teacher(Tid, Tname, Tmob, Tdepart, Tdegree, Tuname, Tpass);
		List<Teacher> tlist=new ArrayList<Teacher>();
		tlist.add(tobj);
		
		TeacherDao tdao=new TeacherDaoImpl();
		int i=tdao.updateTeacher(tlist);
		
//		HttpSession session=request.getSession();
//		session.setAttribute("data", tlist);
		PrintWriter pw=response.getWriter();
		if(i>0)
		{
			pw.println("Record Updated...");
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
