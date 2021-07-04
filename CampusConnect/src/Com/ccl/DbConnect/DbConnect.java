package Com.ccl.DbConnect;


import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnect {
	public static Connection con;
public static Connection dbConnect() {
	try {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/campusconnect","root","");

		return con;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return null;
	
}

}
