package project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project1.db.Dbconnection;
import project1.model.Login;
import project1.model.Register;

public class RegisterDaoImpl implements RegisterDao {

	@Override
	public int create(List<Register> lst) {
		int i=0;
		Dbconnection db=new Dbconnection();
		Connection con=db.myConnection();
		Register robj=lst.get(0);
		lst=null;
		
		
		try {
			PreparedStatement pstate=con.prepareStatement("insert into Student values(?,?,?,?,?,?,?,?)");
			pstate.setInt(1,robj.getStudID());
			pstate.setString(2,robj.getStudName());
			pstate.setString(3,robj.getStudDOB());
			pstate.setString(4,robj.getStudDepart());
			pstate.setString(5,robj.getStudYear());
			pstate.setString(6,robj.getStudMob());
			pstate.setString(7,robj.getStudUname());
			pstate.setString(8, robj.getStudPass());
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
	public String ValidateUser(Login lobj) {
		System.out.println(lobj.getStudUname()+"\t"+lobj.getStudPass());
		String str=null;
		List<Register> lstreg=null;
		lstreg=displayAll();
		
		for(Register r:lstreg)
		{// if cond check karat nahi
			if(r.getStudUname().equals(lobj.getStudUname()))
			{
				
				if(r.getStudPass().equals(lobj.getStudPass()))
				{
					str="Valid";
					
				}
				else
				{
					str="Invalid Password";
					
				}
				break;
			}
			else
			{// so str he jat aahe logincontroolr
				str="Invalid UserName";
			}					
		}
		return str;
	}

	@Override
	public List<Register> displayAll() {
		String str="select * from Student";
		
		Dbconnection db=new Dbconnection();
		
		Connection con=db.myConnection();
		
		List<Register> lstreg=new ArrayList<Register>();
		
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery(str);
			while(rs.next())
			{
				Register robj=new Register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				lstreg.add(robj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return lstreg;
	}
	

}
