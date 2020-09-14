

<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
           <jsp:useBean id="student" class="certificate.student_pojo"></jsp:useBean>>
          <jsp:useBean id="dao" class="certificate.user_dao"></jsp:useBean>>
          <%
      
      
       student.setS_name(request.getParameter("student_name"));
       student.setEmail(request.getParameter("email"));
       student.setContact(request.getParameter("mobile"));
       student.setC_name(request.getParameter("course_name"));
       student.setReg_date(request.getParameter("reg_date"));
       student.setDob(request.getParameter("dob"));
       student.setDuration(Integer.parseInt(request.getParameter("duration")));
       student.setU_id(Integer.parseInt(request.getParameter("u_id")));
       student.setE_id(Integer.parseInt(request.getParameter("e_id")));
        if(dao.add_student(student.getS_name(),student.getEmail(),student.getContact(),student.getC_name(),student.getReg_date()
                ,student.getDob(),student.getDuration(),student.getU_id(),student.getE_id())>0)
        {
            out.println("<script>alert('student registered successfully');"
                    + "window.location.href='add_student.jsp'</script>");
        }
        else
        {
            out.println("<script>alert('student not registered');"
                    + "window.location.href='add_student.jsp'<script>");
        }
          
        
               %>
    </body>
</html>
