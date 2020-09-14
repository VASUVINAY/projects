<%@page import="java.util.StringTokenizer"%>
<%@page import="javafx.scene.control.Alert" %>
<jsp:useBean id="Admin" class="myarrange.admin_dao"></jsp:useBean>
<%
    String data = request.getParameter("data");
    StringTokenizer st = new StringTokenizer(data,"*");
    int e_id = Integer.parseInt(st.nextToken());
    String e_name = st.nextToken();
      String email = st.nextToken();
      String sex = st.nextToken();
      String dob = st.nextToken();
      String w_field = st.nextToken();
      String branch = st.nextToken();
      String designation = st.nextToken();
       int experience = Integer.parseInt(st.nextToken());
      String mobile = st.nextToken();
      String employee_id = st.nextToken();
      String address = st.nextToken();
    int i = Admin.updateemployee(e_id, e_name, email, sex, dob, w_field, branch, designation, experience, mobile, employee_id, address);
    if(i>0)
        out.print("Record Updated");
    else
        out.print("Record not Updated");
%>