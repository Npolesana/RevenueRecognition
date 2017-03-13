<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Revenue</title>
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
<table class="table table-hover">
<tr>
<td>Total revenue calculated is <% out.println(request.getAttribute("contractRevenueAsOf")); %> </td>
</tr>
</table>
     <div class="panel-footer">Nicola Polesana's Revenue Recognition</div>

</body>
</html>