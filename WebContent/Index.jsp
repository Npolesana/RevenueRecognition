<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="layout" content="width=device-width, initial-scale=1">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="bootstrap/css/bootstrap.min.css"></script>
<title>Index</title>
</head>
<style>
 .row.content {height: 450px}
</style>
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
<div class = "container">
 <div class="panel panel-default">
    <div class="panel-body">
<h3>Soen 387: Assignment 2</h3>
<h3>Revenue Recognition </h3>
 </div></div>
 <form action="RevenueController" method="get">
     <div class="form-group">
    <p/> Enter a contract number for your query <br/>
 	<input type="text" size="20" name="cnumber" required/> <p/> 
 	<input type="submit" value="Enter" class="btn btn-primary">
 	<input type = "reset" value="Clear" class="btn btn-primary">
 	</div>
 </form>
 </div>
     <div class="panel-footer">Nicola Polesana's Revenue Recognition</div>
 
     <script src="http://code.jquery.com/jquery.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>