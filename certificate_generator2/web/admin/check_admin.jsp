
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Certificate Generator</title>
    </head>
    <body>

<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/certificate_generator","root","");
String id=request.getParameter("id");
 String pass=request.getParameter("password");
 Statement stmt=con.createStatement();
 ResultSet rs=stmt.executeQuery("select count(*) from admin where a_id='"+id+"' and a_password='"+pass+"' ");
 rs.next();
 int chk=rs.getInt(1);
// out.println("<h1>code  : "+code+"</h1>");
 if (chk>0) {
  //   session.setAttribute("code", code);
        out.println("<script>alert('Login Success'); window.location.href='admin.jsp';</script>");
             }
 else
     {
  out.println("<script>alert('Invalid id and Password'); window.location.href='login.jsp';</script>");

    }
%>
    </body>
</html>
