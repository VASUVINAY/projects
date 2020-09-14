<%-- 
    Document   : sidebar
    Created on : 17 Feb, 2020, 4:34:05 PM
    Author     : Lenovo
--%>
<%@page  import="java.sql.*,beans.Subscriber" %>                    
<div class="col-lg-3">

        <h1 class="my-4">TOP CATEGORY</h1>
        <div class="list-group">
            <a href="home.jsp" class="list-group-item <%if(request.getParameter("cat_id")==null) out.println(" active ");%>"> All CATEGORY </a>   <br/>
                   
            <%
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gist", "root", "");
                     String sql="select * from news_category";
                      PreparedStatement smt = con.prepareStatement(sql);
                       ResultSet rs = smt.executeQuery();
                                  int i = 1;
                                   while (rs.next()) {%>
                                   <a href="home.jsp?cat_id=<%=rs.getString("id")%>" class="list-group-item <%if(rs.getString("id").equals(String.valueOf(request.getParameter("cat_id")))) out.println(" active ");%>"> <%=rs.getString("name")%> </a>   <br/>
                        <%}
                                con.close();
                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }

                %>
                            
                
                           
    <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#myModal">
    Subscribe Us
    </button>
   
           
        </div>
  
     <!-- The Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Fill the Basic Details</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
           <form method="post" class="form bg-light">
                        <input type="text" placeholder="Enter Name" name="name" class="form-control"> <br/><br/>
                        <input type="email" name="email" placeholder="Enter your email" class="form-control"/> <br/><br/>
                        <input type="submit" value="Subscribe" class="btn btn-dark form-control" name="submit"/>
         </form>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>           
    </div>        

  </div>
</div>
                
<%if(request.getParameter("submit")!=null){%>
<jsp:useBean id="subscriber" class="beans.Subscriber"></jsp:useBean>
<jsp:setProperty name="subscriber" property="*"></jsp:setProperty>

<%
Connection con = null;
PreparedStatement smt=null;
try{
    Class.forName("com.mysql.jdbc.Driver");
    con =DriverManager.getConnection("jdbc:mysql://localhost:3306/gist","root","");
    String sql = "Insert into subscribers (name,email) values(?,?)";
    smt = con.prepareStatement(sql);
    smt.setString(1, subscriber.getName());
    smt.setString(2, subscriber.getEmail());
    int n =smt.executeUpdate();
    con.close();
    smt.close();
    if(n>0)
        out.println("<script>alert('Thanks for subscription !');</script>");
}catch(Exception e){
    if(e.getMessage().contains("Duplicate"))
        out.println("<script>alert('You Have Already Subscribed this Channel !!!');</script>");
    System.out.println("Error : "+ e.getMessage()); 
}
}
%>