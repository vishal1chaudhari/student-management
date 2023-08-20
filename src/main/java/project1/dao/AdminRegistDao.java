package project1.dao;

import java.util.List;

import project1.model.AdminLogin;
import project1.model.AdminRegister;
import project1.model.Register;

public interface AdminRegistDao {
	public int create(List<AdminRegister> alst);
	String validateUser(AdminLogin alobj);
	List<AdminRegister> adisplayAll();
	public List<Register> search(int studID);
	public int delete(List<Register> lstreg);
	List<Register> AStudentDisplayAll();
	public int update(List<Register> lstreg);

}
