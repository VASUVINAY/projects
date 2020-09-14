
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<%@page import="beans.Reporter"%>
<%@page import="beans.Admin"%>
<%@page import="dao.ReporterDao"%>  

<%@page import="dao.AdminDao"%>  
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    
<head>
	<title>   Login Page</title>
        <jsp:include page="base.jsp"></jsp:include>
        <style>
            
          
		body,
		html {
			margin: 0;
			padding: 0;
			height: 100%;
			background: black;
		}
		.user_card {
			height: 400px;
			width: 350px;
			margin-top: auto;
			margin-bottom: auto;
			background-color: salmon;
			position: relative;
			display: flex;
			justify-content: center;
			flex-direction: column;
			padding: 10px;
			box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			-webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			-moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			border-radius: 5px;

		}
		.brand_logo_container {
			position: absolute;
			height: 170px;
			width: 170px;
			top: -75px;
			border-radius: 50%;
			background: #60a3bc;
			padding: 10px;
			text-align: center;
		}
		.brand_logo {
			height: 150px;
			width: 150px;
			border-radius: 50%;
			border: 2px solid white;
		}
		.form_container {
			margin-top: 100px;
		}
		.login_btn {
			width: 100%;
			background: yellowgreen !important;
			color: white !important;
		}
		.login_btn:focus {
			box-shadow: none !important;
			outline: 4px !important;
		}
		.login_container {
			padding: 0 2rem;
		}
		.input-group-text {
			background: #c0392b !important;
			color: white !important;
			border: 0 !important;
			border-radius: 0.25rem 0 0 0.25rem !important;
		}
		.input_user,
		.input_pass:focus {
			box-shadow: none !important;
			outline: 0px !important;
		}
		.custom-checkbox .custom-control-input:checked~.custom-control-label::before {
			background-color: #c0392b !important;
		}
            
            
            
            
            
            
            
            
            
        </style>
        
</head>

<body>
    <%
        
              
         
          //Reading cookie 
           Cookie cookies[] = request.getCookies();
           String userid="",password="";
           
           for(Cookie c : cookies){
               if(c.getName().equals("userid"))
               {
                   userid=c.getValue();
               }
               if (c.getName().equals("password"))
               {
                   password = c.getValue();
               }
           }
          
       %>    
      
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<img src="assets/images/0130020.jpg" class="brand_logo" alt="Logo">
					</div>
				</div>
				<div class="d-flex justify-content-center form_container">
					<form>
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
                                                    <input type="text"  id="inputemail" name="userid" class="form-control input_user"  autocomplete="off" value="<%=userid%>" placeholder="username">
                                     
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="password" class="form-control input_pass" autocomplete="off" value="<%=password%>" placeholder="password">
						</div>
                                                 <div style="border-style: solid; border-radius: 10px; border-width:1px"> 
      <h6>Select Role </h6> 
      <input type="radio" name="role" id="role1" value="admin"/>  <label for="role1"><b>Admin </b></label>
      <input type="radio" name="role" id="role2" value="reporter"/> <label for="role2"><b>Employee</b></label> </div>
      
      
						<div class="form-group">
							<div class="custom-control custom-checkbox">
                                                            <input type="checkbox" class="custom-control-input" id="customControlInline" name="remember" value="remember">
								<label class="custom-control-label" for="customControlInline" class="class1">Remember me</label>
							</div>
						</div>
							<div class="d-flex justify-content-center mt-3 login_container">
                                                            <button class="btn btn-lg btn-primary btn-block" type="submit" name="submit">Login</button>
                                                        </div>
				   
					</form>
				</div>
		
				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Don't have an account? <a href="reporter/addReporter.jsp" class="ml-2">Sign Up</a>
					</div>
<!--					<div class="d-flex justify-content-center links">
						<a href="#">Forgot your password?</a>
					</div>-->
				</div>
			</div>
		</div>
	</div>
    <%                                              
                                            
      if(request.getParameter("submit")!=null){
            userid=request.getParameter("userid");
             password=request.getParameter("password");
             String role=request.getParameter("role");
              if(role.equals("reporter")){
                  ReporterDao rep=new ReporterDao();
                 Reporter reporter =  rep.getById(userid);
                    boolean id= rep.isUserIdExist(userid);
                     if(id!=true){
//                       session.setAttribute("reporter",);
                       response.sendRedirect("../login.jsp");
              }
                     else{
                         session.setAttribute("reporter",reporter);
                         response.sendRedirect("reporter/reporterDashBoard.jsp");}
            
           
       }
              else if(role.equals("admin")){
                   AdminDao ad=new AdminDao();
                   Admin admin=ad.getById(userid);
                    boolean exist=ad.isUserIdExist(userid);
                    if(exist!=true){
                         response.sendRedirect("../login.jsp");
                         
                    }
                    else{
                        session.setAttribute("admin",admin);
                        response.sendRedirect("admin/adminDashBoard.jsp");
                    }
                        
                   
                   
               
                  
                  
                  
                  
              }
      }
 %>
      
    
        
          
</body>
</html>
