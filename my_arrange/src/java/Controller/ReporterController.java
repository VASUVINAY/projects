 
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import beans.Reporter;
import com.sun.xml.bind.v2.schemagen.Util;
import dao.ReporterDao;
import utility.FileUploader;

public class ReporterController extends HttpServlet {

    
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        String op =request.getParameter("op");
        
        if (op!=null && op.equalsIgnoreCase("add")){
            HttpSession session = request.getSession();
            Reporter reporter = (Reporter)session.getAttribute("reporter");
            System.out.println("rahul");
            ReporterDao rd = new ReporterDao();
            
            String ImagePath = "";
            ImagePath  = FileUploader.getUploadedPath(getServletContext(), "reporter/media", request);
            reporter.setImage(ImagePath);
            System.out.println("setimage tak chal gya");
            
            if(rd.add(reporter)){
                session.removeAttribute("reporter");
                out.println("Reproter Added Successfully !");
            }
        }
        
         if(op!=null  && op.equalsIgnoreCase("update")){
                
             if (op!=null && op.equalsIgnoreCase("update")){
            HttpSession session = request.getSession();
            Reporter reporter = (Reporter)session.getAttribute("reporter");
            ReporterDao rd = new ReporterDao();
            
            String imagePath = "";
            imagePath  = FileUploader.getUploadedPath(getServletContext(), "media/reporter", request);
            if(imagePath.equals("media/reporter/"))
                reporter.setImage(reporter.getImage());
            else
                reporter.setImage(imagePath);
            
            if(rd.update(reporter)){
                session.removeAttribute("reporter");
                out.println("Reproter Added Successfully !");
//                response.sendRedirect("admin/dashboard.jsp");
            }
        }
    }    
                
    }
}
