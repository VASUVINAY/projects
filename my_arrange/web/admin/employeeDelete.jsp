<%@page import="java.util.StringTokenizer"%>
<%@page import="javafx.scene.control.Alert" %>
<jsp:useBean id="Admin" class="myarrange.admin_dao"></jsp:useBean>
<%
    int id= Integer.parseInt(request.getParameter("id"));
    int i = Admin.deleteemployee(id);
    if(i>0)
        out.print("Record Deleted");
    else
        out.print("Record not Deleted");
%>