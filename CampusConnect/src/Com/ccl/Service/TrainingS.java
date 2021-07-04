package Com.ccl.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.ccl.Dao.TrainingImpl;
import Com.ccl.model.Training;

/**
 * Servlet implementation class TrainingS
 */
@WebServlet("/TrainingS")
public class TrainingS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainingS() {
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
		int tid=Integer.parseInt(request.getParameter("tid"));
		String cid=request.getParameter("cid");
		String date=request.getParameter("date");
		String ftime=request.getParameter("ftime");
		String ttime=request.getParameter("ttime");
		int id=Integer.parseInt(cid);
		Training tr=new Training(tid,id,date,ftime,ttime);
		TrainingImpl t1=new TrainingImpl();
		int i=t1.ScheduleTraining(tr);
		if(i!=0)
			{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Training ADDED');");
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
