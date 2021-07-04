package Com.ccl.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import Com.ccl.DbConnect.DbConnect;
import Com.ccl.model.Trainer;

public class TrainerImpl implements ITrainer {
	

	@Override
	public int InsertTrainer(Trainer t1) {
		String name=t1.getName();
		String skill=t1.getSkill();
		String phone=t1.getNumber();
		String email=t1.getEmail();
		Connection con=DbConnect.dbConnect();
		Statement stmt;
		int rs = 0;
		try {
			stmt = con.createStatement();
		
		  
			rs = stmt.executeUpdate
				        ("insert into Trainer(name,skill,mobile,email)"
				 		       + " values('"+name+"','"+skill+"','"+phone+"','"+email+"')");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 if(rs!=0)
			 return 1;
		 else
			 return 0;
		
		

	}

	@Override
	public ArrayList<Trainer> FetchTrainer() throws SQLException {
		 ArrayList<Trainer> data=new ArrayList<Trainer>();
			Connection con=DbConnect.dbConnect();
		     Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery("select * from Trainer");
		    while(rs.next())
		    {
		     Trainer obj=new Trainer("rs.getString(2)","rs.getString(3)","rs.getString(4)","rs.getString(5)");
		     obj.settId(rs.getInt(1));
		     data.add(obj);
		    }
		    return data;
	}

	

}
