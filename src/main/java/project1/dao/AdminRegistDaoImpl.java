package project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project1.db.Dbconnection;
import project1.model.AdminLogin;
import project1.model.AdminRegister;
import project1.model.Register;


public class AdminRegistDaoImpl implements AdminRegistDao {

	@Override
	public int create(List<AdminRegister> alst) {
		int i=0;
		Dbconnection db=new Dbconnection();
		Connection con=db.myConnection();
		AdminRegister aobj=alst.get(0);
		alst=null;
		
		
		try {
			PreparedStatement pstate=con.prepareStatement("insert into Admin values(?,?,?,?)");
			pstate.setInt(1,aobj.getAdminNo());
			pstate.setString(2,aobj.getCustName());
			pstate.setString(3,aobj.getUserName());
			pstate.setString(4,aobj. getPassword());
			
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0)
		{
			System.out.println("Record Save");
		}
		
		
		
		return i;
	}

	@Override
	public String validateUser(AdminLogin alobj) {
		System.out.println(alobj.getUserName()+"\t"+alobj.getPassword());
		String str=null;
		List<AdminRegister> alstreg=null;
		alstreg=adisplayAll();
		
		for(AdminRegister ar:alstreg)
		{
			if(ar.getUserName().equals(alobj.getUserName()))
			{
				if(ar.getPassword().equals(alobj.getPassword()))
				{
					str="valid";
					
				}
				else
				{
					str="Invalid Password";
				
				}
				break;
			}
			else
			{
				str="Invalid UserName";
			}
				
				
						
		}
		return str;
	}

	@Override
	public List<AdminRegister> adisplayAll() {
		String str="select * from Admin";
		
		Dbconnection db=new Dbconnection();
		
		Connection con=db.myConnection();
		
		List<AdminRegister> alstreg=new ArrayList<AdminRegister>();
		
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery(str);
			while(rs.next())
			{
				AdminRegister aobj=new AdminRegister(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				alstreg.add(aobj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return alstreg;
	}

	@Override
	public List<Register> search(int studID) {
		List<Register> lsrrec=null;
		int i=0;
		ResultSet rs=null;
		Dbconnection db=new Dbconnection();
		Connection con=db.myConnection();
		
		try {
			PreparedStatement pstate=con.prepareStatement("select * from Student where studid=?");
			pstate.setInt(1, studID);
			rs=pstate.executeQuery();
			
			if(rs.next())
			{
				Register robj=new Register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				lsrrec=new ArrayList<Register>();
				lsrrec.add(robj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lsrrec;
	}

	@Override
	public int delete(List<Register> lstreg) {
		int i=0;
		Dbconnection db=new Dbconnection();
		Connection con=db.myConnection();
		Register robj=lstreg.get(0);
		lstreg=null;
		
		try {
			PreparedStatement pstate=con.prepareStatement("delete from Student where studid=?");
			pstate.setInt(1,robj.getStudID());
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(i>0) {
			System.out.println("Record Delete");
		}
		return i;


	}

	@Override
	public List<Register> AStudentDisplayAll() {
		String str="select * from Student";
		
		Dbconnection db=new Dbconnection();
		
		Connection con=db.myConnection();
		
		List<Register> lstreg=new ArrayList<Register>();
		Statement stat=null;
		ResultSet rs=null;
		try {
			stat=con.createStatement();
			rs=stat.executeQuery(str);
			while(rs.next())
			{
//				AdminRegister aobj=new AdminRegister(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
//				alstreg.add(aobj);
				Register robj=new Register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				lstreg.add(robj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return lstreg;
	}

	@Override
	public int update(List<Register> lstreg) {
		Dbconnection db=new Dbconnection();
		Connection con=db.myConnection();
		int i=0;
		Register robj=lstreg.get(0);
		
		try {
			PreparedStatement ps=con.prepareStatement("update Student set studName=?,studDOB=?,studDepart=?,studYear=?,studMob=?,studUname=?,studPass=? where studID=?");
			ps.setString(1, robj.getStudName());
			ps.setString(2, robj.getStudDOB());
			ps.setString(3, robj.getStudDepart());
			ps.setString(1, robj.getStudYear());
			ps.setString(2, robj.getStudMob());
			ps.setString(1, robj.getStudUname());
			ps.setString(2, robj.getStudPass());
			ps.setInt(5, robj.getStudID());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0)
		{
			System.out.println("Record Updated...");
		}
		
		return i;
	}




	
	

	

	
}
