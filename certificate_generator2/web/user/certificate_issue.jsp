<!DOCTYPE html>
<html lang="en">
<head>
<title>Certificate Issue</title>
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

<!--close-Header-part--> 

<!--top-Header-menu-->


<!--start-top-serch-->

<!--close-top-serch--> 

<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
  <ul>
    <li ><a href="user.jsp"><i class="icon icon-dashboard"></i> <span>Dashboard</span></a> </li>
    <li > <a href="add_employee.jsp"><i class="icon icon-building"></i> <span>Add Employee</span></a> </li>
    <li > <a href="add_employee.jsp"><i class="icon icon-building"></i> <span>List Employee</span></a> </li>
    <li > <a href="add_student.jsp"><i class="icon icon-building"></i> <span>Add Student</span></a> </li>
    <li > <a href="add_student.jsp"><i class="icon icon-building"></i> <span>List Student</span></a> </li>
    <li><a href="mark_attendence.jsp"><i class="icon-file-alt"></i> <span>Mark Attendence</span></a></li>
    <li class="active"><a href="certificate_issue.jsp"><i class="icon-book"></i> <span>Generate Certificate</span></a></li>
    <li><a href="subscription.jsp"><i class="icon-suitcase"></i> <span>Subscription</span></a></li>
    
  </ul>
</div>

<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="admin.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>
        <a href="#" class="current">Certificate Issue</a> </div>
    <h1>Certificate Issue</h1>
  </div>
  <div class="container-fluid"><hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-info-sign"></i> </span>
            <h5>Details</h5>
          </div>
          <div class="widget-content nopadding">
            <form class="form-horizontal" method="post" action="get_institute.jsp" name="basic_validate" id="basic_validate" novalidate="novalidate">
              <div class="control-group">
                <label class="control-label">Company Name</label>
                <div class="controls">
                  <input type="text" name="company_name" id="company_name">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Company Email</label>
                <div class="controls">
                  <input type="text" name="company_email" id="company_email">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Company Number</label>
                <div class="controls">
                  <input type="text" name="company_number" id="company_number">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Student Id</label>
                <div class="controls">
                  <input type="integer" name="student_id" id="student_id">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">Student Name</label>
                <div class="controls">
                  <input type="text" name="student_name" id="student_name">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">Student Email</label>
                <div class="controls">
                  <input type="text" name="student_email" id="student_email">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">Course</label>
                <div class="controls">
                  <input type="text" name="course" id="course">
                </div>
              </div>
                 <div class="control-group">
                <label class="control-label">Duration</label>
                <div class="controls">
                  <input type="integer" name="duration" id="duration">
                </div>
              </div>
                <div class="control-group">
                <label class="control-label">Certificate Number</label>
                <div class="controls">
                  <input type="text" name="certificate_number" id="certificate_number">
                </div>
              </div>
                <div class="control-group">
                <label class="control-label">Issue Date</label>
                <div class="controls">
                  <input type="date" name="issue_date" id="issue_date">
                </div>
              </div>
              <div class="form-actions">
                <input type="submit" value="Generate" class="btn btn-success">
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
