

<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
          <jsp:useBean id="invoice" class="certificate.invoice_pojo"></jsp:useBean>>
          <jsp:useBean id="dao" class="certificate.admin_dao"></jsp:useBean>>
          <%
      
      
       invoice.setU_id(Integer.parseInt(request.getParameter("user_id")));
       invoice.setName(request.getParameter("name"));
       invoice.setDesignation(request.getParameter("designation"));
       invoice.setAmount(Integer.parseInt(request.getParameter("amount")));
       invoice.setFrom_date(request.getParameter("fdate"));
       invoice.setTo_date(request.getParameter("tdate"));
        if(dao.createinvoice(invoice.getU_id(),invoice.getName(),invoice.getDesignation(),
                invoice.getAmount(),invoice.getFrom_date(),invoice.getTo_date())>0)
        {
            out.println("<script>alert('Invoice Data Feeded');"
                    + "window.location.href='create_invoice.jsp'</script>");
        }
        else
        {
            out.println("<script>alert('Invoice data not feeded');"
                    + "window.location.href='create_invoice.jsp'<script>");
        }
          
        
               %>
    </body>
</html>
