package project1.model;

public class AdminRegister {
	private int AdminNo;
	private String CustName;
	private String UserName;
	private String Password;
	public AdminRegister(int adminNo, String custName, String userName, String password) {
		super();
		AdminNo = adminNo;
		CustName = custName;
		UserName = userName;
		Password = password;
	}
	public int getAdminNo() {
		return AdminNo;
	}
	public void setAdminNo(int adminNo) {
		AdminNo = adminNo;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	

}
