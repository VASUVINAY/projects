<!DOCTYPE html>
<html lang="en">
<head>
<title>Subscription</title>
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
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Certificate Generator</a></h1>
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
        <li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
      </ul>
    </li>
    <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <b class="caret"></b></a>
      </li>
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
    <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
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
    <li class="active"><a href="user.jsp"><i class="icon icon-dashboard"></i> <span>Dashboard</span></a> </li>
    <li > <a href="add_employee.jsp"><i class="icon icon-building"></i> <span>Add Employee</span></a> </li>
    <li > <a href="employee_report.jsp"><i class="icon icon-building"></i> <span>List Employee</span></a> </li>
    <li > <a href="add_student.jsp"><i class="icon icon-building"></i> <span>Add Student</span></a> </li>
    <li > <a href="student_report.jsp"><i class="icon icon-building"></i> <span>List Student</span></a> </li>
    <li><a href="mark_attendence.jsp"><i class="icon-file-alt"></i> <span>Mark Attendence</span></a></li>
    <li><a href="certificate_issue.jsp"><i class="icon-book"></i> <span>Generate Certificate</span></a></li>
    <li><a href="subscription.jsp"><i class="icon-suitcase"></i> <span>Subscription</span></a></li>
    
  </ul>
</div>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
    <h1>Subscription Tables</h1>
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>Subscription table</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>From</th>
                  <th>To</th>
                   <th>Duration</th>
                  <th>Amount</th>
                  <th>Offer</th>
                </tr>
              </thead>
              <tbody>
                <tr class="odd gradeX">
                  <td>January</td>
                  <td>March</td>
                  <td>3 Month</td>
                  <td class="center"> 12000</td>
                  <td class="center">No</td>
                </tr>
                <tr class="even gradeC">
                  <td>April</td>
                  <td>June</td>
                  <td>3 Month</td>
                  <td class="center"> 12000</td>
                  <td class="center">No</td>
                </tr>
                <tr class="odd gradeA">
                  <td>July</td>
                  <td>September</td>
                  <td>3 Month</td>
                  <td class="center"> 12000</td>
                  <td class="center">No</td>
                </tr>
                <tr class="even gradeA">
                  <td>October</td>
                  <td>December</td>
                  <td>3 Month</td>
                  <td class="center"> 12000</td>
                  <td class="center">No</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
        
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.tables.js"></script>
</body>
</html>
