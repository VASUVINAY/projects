package Com.ccl.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Com.ccl.DbConnect.DbConnect;
import Com.ccl.model.Admin;

public class AdminImpl implements IAdmin{
	

	@Override
	public int Check(Admin a) throws SQLException {
		
		String user=a.getId();
		String pass=a.getPassword();
		
		Connection con=DbConnect.dbConnect();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select count(*) from admin where id='"+user+"' and pass='"+pass+"' ");
		 rs.next();
		 int chk=rs.getInt(1);
		 if (chk!=0) 
			  return 1;
			 else
			 return 0;
			   
		
	}

}
