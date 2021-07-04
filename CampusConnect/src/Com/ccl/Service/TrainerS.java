package Com.ccl.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.ccl.Dao.TrainerImpl;
import Com.ccl.model.Trainer;

/**
 * Servlet implementation class TrainerS
 */
@WebServlet("/TrainerS")
public class TrainerS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainerS() {
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
		String name=request.getParameter("user");
		String skill=request.getParameter("skill");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		Trainer t1=new Trainer(name,skill,phone,email);
		TrainerImpl tr=new TrainerImpl();
		int i=tr.InsertTrainer(t1);
		if(i!=0)
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Trainer Added');");
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
