<html>
    <head>
    </head>
    <body>
          <jsp:useBean id="message" class="certificate.message_pojo"></jsp:useBean>>
          <jsp:useBean id="dao" class="certificate.admin_dao"></jsp:useBean>>
          <%
      
      
       message.setMsg_name(request.getParameter("name"));
       message.setMsg_email(request.getParameter("email"));
       message.setMsg_msg(request.getParameter("message"));
        if(dao.add_msg(message.getMsg_name(),message.getMsg_email(),message.getMsg_msg())>0)
        {
           
               out.println("<script>alert('Your Message sent');"
                    + "window.location.href='register.jsp'</script>");
        }
        else
        {
            out.println("<script>alert('Message Not sent');"
                    + "window.location.href='register.jsp'<script>");
        }
          
        
               %>
    </body>
</html>