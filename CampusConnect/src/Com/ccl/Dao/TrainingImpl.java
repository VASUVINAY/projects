package Com.ccl.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Com.ccl.DbConnect.DbConnect;
import Com.ccl.model.Classroom;
import Com.ccl.model.Trainer;
import Com.ccl.model.Training;

public class TrainingImpl implements ITraining{
  	@Override
	public int ScheduleTraining(Training t1) {
		int tid=t1.getTrainer();
		int cid=t1.getClassroom();
		String date=t1.getDate();
		String ftime=t1.getFTime();
		String ttime=t1.getTTime();
		Connection con=DbConnect.dbConnect();
		Statement stmt;
		int rs = 0;
		try {
			stmt = con.createStatement();
		
		  
			rs = stmt.executeUpdate
				        ("insert into Training(tid,cid,date,ftime,ttime)"
				 		       + " values('"+tid+"','"+cid+"','"+date+"','"+ftime+"','"+ttime+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 if(rs!=0)
			 return 1;
		 else
			 return 0;
	
	}

	
	

	@Override
	public ArrayList<Training> FetchTraining() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Trainer> FetchTName() throws SQLException {
		ArrayList<Trainer> obj=new ArrayList<Trainer>();
		Connection con=DbConnect.dbConnect();
        Statement stmt = con.createStatement();  
        ResultSet rs = stmt.executeQuery("select * from trainer"); 
        while (rs.next()) 
        {  
       	 int id = rs.getInt("id"); 
            String name = rs.getString("name");  
            String skill = rs.getString("skill"); 
            String mobile = rs.getString("mobile");  
            String email = rs.getString("email");  
             Trainer t1=new Trainer(name,skill,mobile,email);
             t1.settId(id);
             obj.add(t1);
          } 
		return obj;
	}


	@Override
	public ArrayList<Classroom> FetchCName() throws SQLException {
		ArrayList<Classroom> obj=new ArrayList<Classroom>();
		Connection con=DbConnect.dbConnect();
        Statement stmt = con.createStatement();  
        ResultSet rs = stmt.executeQuery("select * from Classroom where available='yes'"); 
        while (rs.next()) 
        {  
       	 int id = rs.getInt("id"); 
            String available = rs.getString("available");  
            Classroom t1=new Classroom(id,available);
             obj.add(t1);
          } 
		return obj;
	}


	

}
