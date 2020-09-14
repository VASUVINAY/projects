<%@page import="java.util.ArrayList"%>
<%@page import="certificate.invoice_pojo"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>List Institute</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
 <jsp:useBean id="admin" class="certificate.user_pojo"></jsp:useBean>
          <jsp:useBean id="dao" class="certificate.admin_dao"></jsp:useBean> 
<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Matrix Admin</a></h1>
</div>
<!--close-Header-part--> 

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Welcome User</span><b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a href="#"><i class="icon-user"></i> My Profile</a></li>
        <li class="divider"></li>
        <li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
        <li class="divider"></li>
        <li><a href="login.jsp"><i class="icon-key"></i> Log Out</a></li>
      </ul>
    </li>
    <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span class="label label-important">5</span> <b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> new message</a></li>
        <li class="divider"></li>
        <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> inbox</a></li>
        <li class="divider"></li>
        <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> outbox</a></li>
        <li class="divider"></li>
        <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> trash</a></li>
      </ul>
    </li>
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
    <li class=""><a title="" href="login.jsp"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
  </ul>
</div>

<!--start-top-serch-->
<div id="search">
  <input type="text" placeholder="Search here..."/>
  <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-serch--> 

<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
  <ul>
    <li ><a href="admin.jsp"><i class="icon icon-home"></i> <span>Dashboard</span></a> </li>
    <li> <a href="add_institute.jsp"><i class="icon icon-building"></i> <span>Add Institute</span></a> </li>
    <li> <a href="institue_report.jsp"><i class="icon-file"></i> <span>List Institute</span></a> </li>
    <li> <a href="widgets.html"><i class="icon-file"></i> <span>List Certificate</span></a> </li>
    <li> <a href="create_invoice.jsp"><i class="icon-file"></i> <span>Create Invoice</span></a> </li>
    <li  class="active"> <a href="list_invoice.jsp"><i class="icon-file"></i> <span>List Invoice</span></a> </li>
    <li><a href="tables.html"><i class="icon-bar-chart"></i> <span>Charts</span></a></li>
    <li><a href="subscription.jsp"><i class="icon-suitcase"></i> <span>Subscription</span></a></li>
    
  </ul>
</div>

<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
    <h1>Invoice Table</h1>
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        
        
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>Invoice table</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                   <th>User Id</th>
                   <th>Invoice Number</th>
                   <th>Name</th>
                   <th>Designation</th>
                   <th>Amount</th>
                   <th>From Date</th>
                   <th>To Date</th>
                     </tr>
              </thead>
              <tbody>
                <%
                   ArrayList<invoice_pojo> data=dao.Fetchinvoice();
                   
                   for(invoice_pojo obj:data)
                   {
                   %>
                 <tr>
                      <td><%=obj.getU_id()%></td>
                     <td><%=obj.getInvoice_no()%></td>
                    
                          <td><%=obj.getName()%></td>
                            <td><%=obj.getDesignation()%></td>
                            <td><%=obj.getAmount()%></td>
                            <td><%=obj.getFrom_date()%></td>
                            <td><%=obj.getTo_date()%></td>
                            
  
                
                  </tr>
              <%}%>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<!--Footer-part-->
