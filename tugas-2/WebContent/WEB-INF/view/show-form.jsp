<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
   	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<title>Hobbit Registration Form</title>
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
				<form:form	action="processForm" modelAttribute="hobbit">
					<div class="col-sm-8 mx-auto">
	                	<div class="form-group row">
	                    	<label for="name" class="col-3 col-form-label">First name</label>
	                    	<div class="col-2">
	                    		<form:input class="form-control" path="firstName"/>
	                    	</div>
	                	</div>
	                	<div class="form-group row">
	                    	<label for="name" class="col-3 col-form-label">Last name</label>
	                    	<div class="col-2">
	                    		<form:input class="form-control" path="lastName"/>
	                    	</div>
	                	</div>
	                	<div class="form-group row">
	                		<label for="name" class="col-3 col-form-label">Gender</label>
	                		<div class="col-2 col-form-label">
	                			<form:radiobutton path="gender" value="Male"/>Male
	                		</div>
	                		<div class="col-2 col-form-label">
	                			<form:radiobutton path="gender" value="Female"/>Female
	                		</div>
	                	</div>
	                	<div class="form-group row">
	                		<label for="name" class="col-3 col-form-label">Weapon</label>
	                		<div class="col-2">
	                			<form:select path="Weapon">
									<form:option value="Sword" label="Sword"></form:option>
									<form:option value="Dagger" label="Dagger"></form:option>
									<form:option value="Bow" label="Bow"></form:option>
								</form:select>
	                		</div>
	                	</div>
                        	<a href="/tugas-2"><button type="button" class="btn btn-secondary">Back</button></a>
							<!-- <input class=" btn btn-primary" type="submit" value="Submit">  -->
							<button type="submit" class="btn btn-primary">Submit</button>
                 	</div>
                 </form:form>							
			</div>
		</div>
	</div>
</body>
</html>