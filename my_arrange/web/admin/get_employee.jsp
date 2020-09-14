

<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
          <jsp:useBean id="employee" class="myarrange.employee_pojo"></jsp:useBean>>
          <jsp:useBean id="dao" class="myarrange.admin_dao"></jsp:useBean>>
          <%
      
      
       employee.setE_name(request.getParameter("e_name"));
       employee.setEmail(request.getParameter("email"));
       employee.setSex(request.getParameter("sex"));
       employee.setDob(request.getParameter("dob"));
       employee.setW_field(request.getParameter("prework"));
       employee.setBranch(request.getParameter("branch"));
       employee.setDesignation_name(request.getParameter("designation"));
       employee.setExperience(Integer.parseInt(request.getParameter("experience")));
       employee.setMobile(request.getParameter("mobile"));
       employee.setEmployee_id(request.getParameter("e_id"));
       employee.setAddress(request.getParameter("address"));
        if(dao.add_employee(employee.getE_name(),employee.getEmail(),employee.getSex(),employee.getDob(),employee.getW_field(),employee.getBranch(),employee.getDesignation_name(),employee.getExperience(),employee.getMobile(),employee.getEmployee_id(),employee.getAddress())>0)
        {
            out.println("<script>alert('Employee Added successfully');"
                    + "window.location.href='add_employee.jsp'</script>");
        }
        else
        {
            out.println("<script>alert('Employee Not Added');"
                    + "window.location.href='add_employee.jsp'<script>");
        }
          
        
               %>
    </body>
</html>
