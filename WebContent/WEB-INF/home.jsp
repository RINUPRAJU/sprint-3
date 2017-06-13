<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
 <link  rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<title>Home</title>
</head>
<body>



<header style="background-color:#3b5998;">
<div class="container">
	<div class="row">
	  <div class="col-md-7">
	  <img src="C:\Users\user\Desktop\jinu\mark.jpg" style="height:20px;">  
		<input type="text" placeholder="search facebook"style="width:60%; margin-top:8px;">
		<span class="glyphicon glyphicon-search" style="position: absolute;left:386px;top:14px; "></span></div>
		  <div class="col-md-1"style="margin-top:8px;color:black;"><a href="friendsearch">See More</a></div> 
		   
	  <div class="col-md-4">
    <h5><font color="#fff"><img src="C:\Users\user\Desktop\jinu\mark.jpg" style="height:20px;"></font>${firstname}${lastname}</h5>
			</div>
			</div>
			</div>
</header>

    
   
<div class="container-fluid"style="background-color:#f7f7f7">
	<div class="row" >
    
	<div class="col-md-2"><img src="C:\Users\user\Desktop\jinu\mark.jpg" style="height:20px;"> ${firstname}${lastname} <br><span class="glyphicon glyphicon-edit"></span> Edit profile<br><span class="glyphicon glyphicon-edit"></span><a href="friendrequest">Approve Friend</a></div>
	
	<div class="col-md-6"style="margin-top: 10px;background-color:white;">
	<div class="row"style="height:30px;">
	<div class="col-md-4" style="display:inline-block;border-right-style:solid;border-right-width:2px;border-color:lightgrey;"><span class="glyphicon glyphicon-edit"></span>Update info</div>
	<div class="col-md-4" style="display:inline-block;border-right-style:solid;border-right-width:2px;border-color:lightgrey;"><span class="glyphicon glyphicon-pencil"></span>Write notes</div>
	<div class="col-md-4" style="display:inline-block;"><span class="glyphicon glyphicon-picture">Add photos/videos</span></div>
	</div>
	<div class="row">
	<div class="col-md-1"><img src="C:\Users\user\Desktop\jinu\mark.jpg" style="height:20px;"></div>
	<div class="col-md-6"><textarea placeholder="What's on your mind?"style="margin: 0px; width:400px; height: 90px;"></textarea></div>
	
	</div>
	</div>
	<div class="col-md-3">Your Adds</div>
	</div>
	<div class="row">
	<div class="col-md-1"></div>
	<div class="col-md-6"><textarea style="margin:20px; margin-left: 100px;width:675px; height: 400px;"></textarea></div>
	</div>
    </div>
    
      	
       
        
</body>
</html>
