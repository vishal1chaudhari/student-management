package project1.dao;

import java.util.List;

import project1.model.Login;
import project1.model.Register;

public interface RegisterDao {
	public int create(List<Register> lst);
	List<Register> displayAll();
	String ValidateUser(Login lobj);

}
