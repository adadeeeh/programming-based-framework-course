<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hobbit Registration Form</title>
	</head>
	<body>
		<form:form	action="processForm" modelAttribute="hobbit">
			<table>
				<tr>
					<td>First name: </td>
					<td><form:input path="firstName"/></td>
				</tr>
				<tr>
					<td>Last name: </td>
					<td><form:input path="lastName"/></td>
				</tr>				
				<tr>
					<td>Gender: </td>
					<td><form:radiobutton path="gender" value="Male"/>Male
					<form:radiobutton path="gender" value="Female"/>Female</td>
				</tr>
				<tr>
					<td>Weapon: </td>
						<td><form:select path="Weapon">
							<form:option value="Sword" label="Sword"></form:option>
							<form:option value="Dagger" label="Dagger"></form:option>
							<form:option value="Bow" label="Bow"></form:option>
						</form:select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>