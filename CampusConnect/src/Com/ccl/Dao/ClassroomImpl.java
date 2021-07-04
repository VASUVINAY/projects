package Com.ccl.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Com.ccl.DbConnect.DbConnect;
import Com.ccl.model.Classroom;

public class ClassroomImpl implements IClassroom{
		
	@Override
	public int InsertClassroom(Classroom t1) {
		int id=t1.getcId();
		String available=t1.isAvailable();
		Connection con=DbConnect.dbConnect();
		Statement stmt;
		int rs = 0;
		try {
			stmt = con.createStatement();
		
		  
			rs = stmt.executeUpdate
				        ("insert into Classroom(id,available)"
				 		       + " values('"+id+"','"+available+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 if(rs!=0)
			 return 1;
		 else
			 return 0;
	}


	
}
