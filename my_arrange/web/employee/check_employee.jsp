
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Arrange</title>
    </head>
    <body>

<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myarrange","root","");
String id=request.getParameter("id");
 String pass=request.getParameter("password");
 Statement stmt=con.createStatement();
 ResultSet rs=stmt.executeQuery("select count(*) from employee where e_id='"+id+"' and pass_word='"+pass+"' ");
 rs.next();
 int chk=rs.getInt(1);
// out.println("<h1>code  : "+code+"</h1>");
 if (chk>0) {
  //   session.setAttribute("code", code);
        out.println("<script>alert('Login Success'); window.location.href='employee.jsp';</script>");
             }
 else
     {
  out.println("<script>alert('Invalid id and Password'); window.location.href='login1.jsp';</script>");

    }
%>
    </body>
</html>
