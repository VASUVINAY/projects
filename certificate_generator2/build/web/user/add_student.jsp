<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
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
        <li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
      </ul>
    </li>
    <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span>  <b class="caret"></b></a>
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
    <li ><a href="user.jsp"><i class="icon icon-dashboard"></i> <span>Dashboard</span></a> </li>
    <li > <a href="add_employee.jsp"><i class="icon icon-building"></i> <span>Add Employee</span></a> </li>
    <li > <a href="employee_report.jsp"><i class="icon icon-building"></i> <span>List Employee</span></a> </li>
    <li class="active"> <a href="add_student.jsp"><i class="icon icon-building"></i> <span>Add Student</span></a> </li>
    <li > <a href="student_report.jsp"><i class="icon icon-building"></i> <span>List Student</span></a> </li>
    <li><a href="mark_attendence.jsp"><i class="icon-file-alt"></i> <span>Mark Attendence</span></a></li>
    <li><a href="certificate_issue.jsp"><i class="icon-book"></i> <span>Generate Certificate</span></a></li>
    <li><a href="subscription.jsp"><i class="icon-suitcase"></i> <span>Subscription</span></a></li>
    
  </ul>
</div>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="user.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>
        <a href="#" class="current">Add Student</a> </div>
    <h1>ADD STUDENT</h1>
  </div>
  <div class="container-fluid"><hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-info-sign"></i> </span>
            <h5>Details</h5>
          </div>
          <div class="widget-content nopadding">
            <form class="form-horizontal" method="post" action="get_student.jsp" name="basic_validate" id="basic_validate" novalidate="novalidate">
              <div class="control-group">
                <label class="control-label">Student Name</label>
                <div class="controls">
                  <input type="text" name="student_name" id="student_name">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Email</label>
                <div class="controls">
                  <input type="text" name=email id="email">
                </div>
              </div>
              <div class="control-group">
                  
                <label class="control-label">Contact</label>
                <div class="controls">
                  <input type="text" name="mobile" id="mobile">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Course Name</label>
                <div class="controls">
                  <input type="text" name="course_name" id="course_name">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">Registration Date</label>
                <div class="controls">
                  <input type="date" name="reg_date" id="reg_date">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">Date Of Birth</label>
                <div class="controls">
                  <input type="date" name="dob" id="dob">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">Duration</label>
                <div class="controls">
                  <input type="number" name="duration" id="duration">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">User Id</label>
                <div class="controls">
                  <input type="number" name="u_id" id="u_id">
                </div>
              </div>
                <div class="control-group">
                <label class="control-label">Employee Id</label>
                <div class="controls">
                  <input type="number" name="e_id" id="e_id">
                </div>
              </div>
              <div class="form-actions">
                <input type="submit" value="ADD" class="btn btn-success">
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    
    
  </div>
</div>
<!--Footer-part-->

<!--end-Footer-part-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/jquery.validate.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.form_validation.js"></script>
</body>
</html>
