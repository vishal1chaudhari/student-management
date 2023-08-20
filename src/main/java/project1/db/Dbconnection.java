package project1.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 public class Dbconnection {

 	public static Connection myConnection() {
 		Connection con=null;
 		
 		try {
 			Class.forName("oracle.jdbc.OracleDriver");
			
			//setp2-connection to database
			
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123456789");
			System.out.println("Connection to JDBC"+con);
 		} catch (ClassNotFoundException | SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		return con;
 	}
 }





