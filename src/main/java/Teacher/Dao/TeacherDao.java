package Teacher.Dao;

import java.util.List;

import project1.model.Teacher;
import project1.model.TeacherLogin;

public interface TeacherDao {
	public int saveData(List<Teacher> tlist);
	String validateUser(TeacherLogin tlobj);
	List<Teacher> teacherDisplayAll();
	public List<Teacher> searchTeacher(int Tid);
	public int deleteTeacher(List<Teacher> tlist); //deleteTeacher
	public int updateTeacher(List<Teacher> tlist);
}
