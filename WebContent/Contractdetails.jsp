<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Contract Details</title>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Revenue Recognition</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="http://localhost:8008/Soen387A2/Index.jsp">Home</a></li>
    </ul>
  </div>
</nav>

<h3>Contract number: <% out.println (request.getAttribute("contractNumber")); %> </h3>
<br>
  <table class="table table-hover">
<tr>
<th>Contract number </th>
<td> Details </td>
</tr>
<tr>
<th><% out.println (request.getAttribute("contractNumber")); %> </th>
<td> <% out.println(request.getAttribute("contractdet")); %> </td>
</tr>
</table>
 <div class="panel panel-default">
    <div class="panel-body">
<h3>Calculate the revenue as of </h3>
 <form action="CalculateRevenueController" method="get">
 	<label class="radio-inline"><input type="radio" value="TodayValue" name = "date"> Today </label>
 	<label class="radio-inline"> <input type="radio" value="SelectedDate" name = "date"> Select Date (format = YYYY-MM-DD) </label>
 	<input type = "text" name ="datetoquery">
 	<br><br>
 	 	<input type="submit" value="Enter" class="btn btn-primary">
 	<input type = "reset" value="Clear" class="btn btn-primary">
 	</form>
 	</div>
 	</div>
 	     <div class="panel-footer">Nicola Polesana's Revenue Recognition</div>
 	
 	    <script src="bootstrap/js/bootstrap.min.js"></script>
 	
</body>
</html>