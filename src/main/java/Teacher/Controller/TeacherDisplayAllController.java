package Teacher.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Teacher.Dao.TeacherDao;
import Teacher.Dao.TeacherDaoImpl;
import project1.model.Teacher;

/**
 * Servlet implementation class TeacherDisplayAllController
 */
@WebServlet("/TeacherDisplayAllController")
public class TeacherDisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherDisplayAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherDao tdao=new TeacherDaoImpl();
		List<Teacher> tlist= tdao.teacherDisplayAll();
		
		PrintWriter pw=response.getWriter();
		pw.print("<table>");
		for(Teacher tobj:tlist)
		{
			pw.println("<tr><td>"+tobj.getTid()+"</td><td>"+tobj.getTname()+"</td><td>"+tobj.getTmob()+"</td><td>"+tobj.getTdepart()+"</td><td>"+tobj.getTdegree()+"</td><td>"+tobj.getTuname()+"</td><td>"+tobj.getTpass()+"</td></tr>");
			
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
