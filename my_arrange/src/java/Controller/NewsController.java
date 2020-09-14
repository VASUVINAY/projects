/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.News;
import dao.NewsDao;
import utility.FileUploader;
import javax.servlet.http.HttpSession;
public class NewsController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        String op = request.getParameter("op");
        if(op!=null && op.equalsIgnoreCase("add")){
            HttpSession session = request.getSession();
            News news = (News)session.getAttribute("news");
            String catids[] = (String[]) session.getAttribute("catids");
            System.out.println("catid added");
            NewsDao nd = new NewsDao();
            String imagePath ="";
            imagePath = FileUploader.getUploadedPath(getServletContext(), "media/news", request);
            news.setImage(imagePath);
            System.out.println("yaha tk chal gya");
            if(nd.add(news, catids)){
                session.removeAttribute("news");
                session.removeAttribute("catids");
                out.println("News added Successfully !!");
            }
        }
    }

   

}
