<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
   

    <title>Bharat Vehicle Driving School</title>
<base href='<c:url value="/" />'/>
    <!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    
    

    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="./">Driving School</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a aria-expanded="true" aria-haspopup="true" role="button" data-toggle="dropdown" class="dropdown-toggle" href="#">Students <span class="caret"></span></a>
            <ul class="dropdown-menu">
                  <li><a href="student/add">Add Student</a></li>
                  <li><a href="student">View Students</a></li>
                  
                </ul>
            </li>
            <li><a aria-expanded="true" aria-haspopup="true" role="button" data-toggle="dropdown" class="dropdown-toggle" href="#">Instructor <span class="caret"></span></a>
            <ul class="dropdown-menu">
                  <li><a href="instructor/add">Add Instructor</a></li>
                  <li><a href="instructor">View Instructors</a></li>
                  
                </ul>
                <li><a aria-expanded="true" aria-haspopup="true" role="button" data-toggle="dropdown" class="dropdown-toggle" href="#">Car <span class="caret"></span></a>
            <ul class="dropdown-menu">
                  <li><a href="car/add">Add Car</a></li>
                  <li><a href="car">View Cars</a></li>
                </ul>
            <li><a aria-expanded="true" aria-haspopup="true" role="button" data-toggle="dropdown" class="dropdown-toggle" href="#">Class <span class="caret"></span></a>
            <ul class="dropdown-menu">
                  <li><a href="classes/add">Add Class</a></li>
                  <li><a href="classes">View Classes</a></li>
                </ul>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
