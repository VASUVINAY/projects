<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="Com.ccl.model.Trainer"%>
<%@page import="Com.ccl.model.Classroom"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<jsp:useBean id="dao" class="Com.ccl.Dao.TrainingImpl"></jsp:useBean> 
<div class="container col-6" ><h3 class="text-center">Add Training</h3></div>
<div class="container col-6 mt-5">
<form class="form-control" action="TrainingS" method="post">
Trainer Id: <select class="form-select" name="tid">
<option> Choose Trainer Id</option>
<%
                   ArrayList<Trainer> data=dao.FetchTName();
                   
                   for(Trainer obj:data)
                   {
                   %>
                 
                       <option><%=obj.gettId()%></option>
                    
              <%}%>
  
</select><br>

Classroom ID: <select class="form-select" name="cid">
<option>Choose ClassRoom Id</option>
<%
                   ArrayList<Classroom> data1=dao.FetchCName();
                   
                   for(Classroom obj:data1)
                   {
                   %>
                 
                       <option ><%=obj.getcId()%></option>
                    
              <%}%>
  
</select><br>
Date: <input type="text" class="form-control" name="date"/><br>
From: <input type="text" class="form-control" name="ftime"/><br>
To: <input type="text" class="form-control" name="ttime"/><br>
<input type="submit" class="btn btn-success" value="Login"/><br>
</form>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
</body>
</html>