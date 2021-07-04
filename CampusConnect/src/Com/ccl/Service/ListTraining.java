package Com.ccl.Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.ccl.DbConnect.DbConnect;

/**
 * Servlet implementation class ListTraining
 */
@WebServlet("/ListTraining")
public class ListTraining extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTraining() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		 PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
        	 Connection con=DbConnect.dbConnect();
             Statement stmt = con.createStatement();  
             ResultSet rs = stmt.executeQuery("select * from training");  
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>ID</th><th>Trainer Id</th><th>Classroom Id</th><th>Date</th><th>From</th><th>To</th><tr>");  
             while (rs.next()) 
             {  
            	 int id = rs.getInt("id"); 
            	 int tid = rs.getInt("tid"); 
                 int cid = rs.getInt("cid");  
                 String date = rs.getString("date"); 
                 String ftime = rs.getString("ftime");  
                 String ttime = rs.getString("ttime");  
                  
                 out.println("<tr><td>" + id + "</td><td>" + tid + "</td><td>" + cid + "</td><td>" + date + "</td><td>" + ftime +"</td><td>" + ttime +"</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
