

<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
           <jsp:useBean id="employee" class="certificate.employee_pojo"></jsp:useBean>>
          <jsp:useBean id="dao" class="certificate.user_dao"></jsp:useBean>>
          <%
      
      
       employee.setE_name(request.getParameter("emp_name"));
       employee.setMobile(request.getParameter("mobile"));
       employee.setEmail(request.getParameter("email"));
       employee.setAddress(request.getParameter("addresses"));
       employee.setQualification(request.getParameter("qualification"));
       employee.setPost(request.getParameter("post"));
       employee.setSalary(Integer.parseInt(request.getParameter("salary")));
       employee.setU_id(Integer.parseInt(request.getParameter("u_id")));
       employee.setGender(request.getParameter("gender"));
       employee.setDob(request.getParameter("date"));
        if(dao.add_employee(employee.getE_name(),employee.getMobile(),employee.getEmail(),employee.getAddress()
                ,employee.getQualification(), employee.getPost(),employee.getSalary(),employee.getU_id(),employee.getGender(),employee.getDob())>0)
        {
            out.println("<script>alert('Employee registered successfully');"
                    + "window.location.href='add_student.jsp'</script>");
        }
        else
        {
            out.println("<script>alert('Employee not registered');"
                    + "window.location.href='add_student.jsp'<script>");
        }
          
        
               %>
    </body>
</html>
