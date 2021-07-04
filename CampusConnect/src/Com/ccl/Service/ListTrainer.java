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
 * Servlet implementation class ListTrainer
 */
@WebServlet("/ListTrainer")
public class ListTrainer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTrainer() {
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
             ResultSet rs = stmt.executeQuery("select * from trainer");  
             out.println("<div style:margin-left:230px;><table border=1  width=50% height=50%>");  
             out.println("<tr><th>ID</th><th>Name</th><th>Skill</th><th>Mobile</th><th>Email</th><tr>");  
             while (rs.next()) 
             {  
            	 int id = rs.getInt("id"); 
                 String name = rs.getString("name");  
                 String skill = rs.getString("skill"); 
                 String mobile = rs.getString("mobile");  
                 String email = rs.getString("email");  
                  
                 out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + skill + "</td><td>" + mobile + "</td><td>" + email +"</td></tr>");   
             }  
             out.println("</table></div>");  
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
