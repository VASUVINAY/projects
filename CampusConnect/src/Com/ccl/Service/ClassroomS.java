package Com.ccl.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.ccl.Dao.ClassroomImpl;
import Com.ccl.model.Classroom;

/**
 * Servlet implementation class ClassroomS
 */
@WebServlet("/ClassroomS")
public class ClassroomS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassroomS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("room"));
		String available=request.getParameter("available");
		Classroom c1=new Classroom(id,available);
		ClassroomImpl cl = new ClassroomImpl();
		int i=cl.InsertClassroom(c1);
		if(i!=0)
			{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Classroom Added');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("Choose.jsp");
			rd.include(request, response);
			}
		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Invalid Information');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("Choose.jsp");
			rd.include(request, response);
		}
	}

}
