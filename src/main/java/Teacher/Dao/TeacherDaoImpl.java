package Teacher.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project1.db.Dbconnection;
import project1.model.Register;
import project1.model.Teacher;
import project1.model.TeacherLogin;

public class TeacherDaoImpl implements TeacherDao {
	Connection con=null;

	@Override
	public int saveData(List<Teacher> tlist) {
		Dbconnection db=new Dbconnection();
		con=db.myConnection();
		Teacher tobj=tlist.get(0);
		tlist=null;
		
		int i=0;
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into Teacher values(?,?,?,?,?,?,?)");
			ps.setInt(1, tobj.getTid());
			ps.setString(2, tobj.getTname());
			ps.setString(3, tobj.getTmob());
			ps.setString(4, tobj.getTdepart());
			ps.setString(5, tobj.getTdegree());
			ps.setString(6, tobj.getTuname());
			ps.setString(7, tobj.getTpass());
			
			i=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public String validateUser(TeacherLogin tlobj) {
		List<Teacher> tlist=teacherDisplayAll();
		
		String str=null;
		for(Teacher tobj:tlist )
		{
			if(tobj.getTuname().equals(tlobj.getTuname())) {
				if(tobj.getTpass().equals(tlobj.getTpass())) {
					str="valid";
				}
			}
			else
			{
				str="invalid";
			}
		}
		
		return str;
	}

	@Override
	public List<Teacher> teacherDisplayAll() {
		con=Dbconnection.myConnection();
		
		String str="select * from Teacher";
		List<Teacher> tlist=new ArrayList<Teacher>();
		Statement state=null;
		ResultSet rs=null;
		try {
			state=con.createStatement();
			rs=state.executeQuery(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(rs.next())
			{
				Teacher tobj=new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				tlist.add(tobj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tlist;
	}


	@Override
	public List<Teacher> searchTeacher(int Tid) {
		con=Dbconnection.myConnection();
		List<Teacher> tlist=null;
		ResultSet rs=null;
	
		try {
			PreparedStatement ps=con.prepareStatement("select * from Teacher where Tid=?");
			ps.setInt(1, Tid);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(rs.next())
			{
				Teacher tobj=new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				tlist=new ArrayList<Teacher>();
				tlist.add(tobj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tlist;
	}

	@Override
	public int deleteTeacher(List<Teacher> tlist) {
		Dbconnection db=new Dbconnection();
		Connection con=db.myConnection();
		Teacher tobj=tlist.get(0);
		int i=0;
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from Teacher where Tid=?");
			ps.setInt(1, tobj.getTid());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(i>0)
		{
			System.out.println("Record delete");
		}
		
		return i;
	}

	@Override
	public int updateTeacher(List<Teacher> tlist) {
		Dbconnection db=new Dbconnection();
		Connection con=db.myConnection();
		int i=0;
		Teacher tobj=tlist.get(0);
		
		try {
			PreparedStatement ps=con.prepareStatement("update Teacher set Tname=?,Tmob=?,Tdepart=?,Tdegree=?,Tuname=?,Tpass=? where Tid=?");
			ps.setString(1, tobj.getTname());
			ps.setString(2, tobj.getTmob());
			ps.setString(3, tobj.getTdepart());
			ps.setString(4, tobj.getTdegree());
			ps.setString(5, tobj.getTuname());
			ps.setString(6, tobj.getTpass());
			ps.setInt(7, tobj.getTid());
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
