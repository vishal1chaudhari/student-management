package project1.model;

public class TeacherLogin {
	private String Tuname;
	private String Tpass;
	public TeacherLogin(String tuname, String tpass) {
		super();
		Tuname = tuname;
		Tpass = tpass;
	}
	public String getTuname() {
		return Tuname;
	}
	public void setTuname(String tuname) {
		Tuname = tuname;
	}
	public String getTpass() {
		return Tpass;
	}
	public void setTpass(String tpass) {
		Tpass = tpass;
	}
	
	

}
