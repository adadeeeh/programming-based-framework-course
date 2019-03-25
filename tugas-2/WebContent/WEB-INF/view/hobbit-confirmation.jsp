<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  	<meta charset="utf-8">
   	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<title>Hobbit Details</title>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark rounded">
	           <div class="collapse navbar-collapse justify-content-md-center">
	               <ul class="navbar-nav">
	                   <li class="navbar-brand active"><a class="nav-link" href="/tugas-2">HOME</a></li>
	               </ul>
	           </div>
		</nav>
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
				<div class="col-sm-8 mx-auto">
	                <div class="form-group row">
                    	<label for="name" class="col-3 col-form-label">Name</label>
                    	<div class="col-3 col-form-label">
                    		<p>${hobbit.firstName} ${hobbit.lastName}
                    	</div>
                	</div>
                	<div class="form-group row">
                    	<label for="name" class="col-3 col-form-label">Gender</label>
                    	<div class="col-2 col-form-label">
                    		<p>${hobbit.gender}
                    	</div>
                	</div>
                	<div class="form-group row">
                    	<label for="name" class="col-3 col-form-label">Weapon</label>
                    	<div class="col-2 col-form-label">
                    		<p>${hobbit.weapon}
                    	</div>
                	</div>
				<a href="showForm"><button type="button" class="btn btn-secondary">Back</button></a>
			</div>
		</div>
	</div>
</body>
</html>