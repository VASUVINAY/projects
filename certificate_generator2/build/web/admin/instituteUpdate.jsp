<%@page import="java.util.StringTokenizer"%>
<%@page import="javafx.scene.control.Alert" %>
<jsp:useBean id="Admin" class="certificate.admin_dao"></jsp:useBean>
<%
    String data = request.getParameter("data");
    StringTokenizer st = new StringTokenizer(data,"*");
    int u_id = Integer.parseInt(st.nextToken());
    String owner_name = st.nextToken();
      String owner_id = st.nextToken();
      String company_id = st.nextToken();
      String company_name = st.nextToken();
      int subscription = Integer.parseInt(st.nextToken());
      String mobile = st.nextToken();
      String email = st.nextToken();
      String address = st.nextToken();
      String pass = st.nextToken();
    int i = Admin.updateinstitute(u_id, owner_name, owner_id, company_id, company_name, subscription, mobile, email, address, pass);
    if(i>0)
        out.print("Record Updated");
    else
        out.print("Record not Updated");
%>