

<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
          <jsp:useBean id="institute" class="certificate.user_pojo"></jsp:useBean>>
          <jsp:useBean id="dao" class="certificate.admin_dao"></jsp:useBean>>
          <%
      
      
       institute.setAddress(request.getParameter("address"));
       institute.setCompany_id(request.getParameter("company_id"));
       institute.setCompany_name(request.getParameter("company_name"));
       institute.setEmail(request.getParameter("email"));
       institute.setMobile(request.getParameter("mobile"));
       institute.setOwner_id(request.getParameter("owner_id"));
       institute.setOwner_name(request.getParameter("owner_name"));
       institute.setSubscription(Integer.parseInt(request.getParameter("subscription")));
       institute.setPass_word(request.getParameter("pass"));
        if(dao.add_institute(institute.getOwner_name(),institute.getOwner_id(),institute.getCompany_id(),
                institute.getCompany_name(),institute.getSubscription(),institute.getMobile(),institute.getEmail(),
                institute.getAddress(),institute.getPass_word())>0)
        {
            out.println("<script>alert('Institute registered successfully');"
                    + "window.location.href='add_institute.jsp'</script>");
        }
        else
        {
            out.println("<script>alert('Institute not registered');"
                    + "window.location.href='add_institute.jsp'<script>");
        }
          
        
               %>
    </body>
</html>
