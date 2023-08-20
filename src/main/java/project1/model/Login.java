package project1.model;

public class Login {
	private String studUname;
	private String studPass;
	public Login(String studUname, String studPass) {
		super();
		this.studUname = studUname;
		this.studPass = studPass;
	}
	public String getStudUname() {
		return studUname;
	}
	public void setStudUname(String studUname) {
		this.studUname = studUname;
	}
	public String getStudPass() {
		return studPass;
	}
	public void setStudPass(String studPass) {
		this.studPass = studPass;
	}
	
	
	

}
