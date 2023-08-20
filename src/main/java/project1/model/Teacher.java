package project1.model;

public class Teacher {
	private int Tid;
	private String Tname;
	private String Tmob;
	private String Tdepart;
	private String Tdegree;
	private String Tuname;
	private String Tpass;
	public Teacher(int tid, String tname, String tmob, String tdepart, String tdegree, String tuname, String tpass) {
		super();
		Tid = tid;
		Tname = tname;
		Tmob = tmob;
		Tdepart = tdepart;
		Tdegree = tdegree;
		Tuname = tuname;
		Tpass = tpass;
	}
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTmob() {
		return Tmob;
	}
	public void setTmob(String tmob) {
		Tmob = tmob;
	}
	public String getTdepart() {
		return Tdepart;
	}
	public void setTdepart(String tdepart) {
		Tdepart = tdepart;
	}
	public String getTdegree() {
		return Tdegree;
	}
	public void setTdegree(String tdegree) {
		Tdegree = tdegree;
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
