<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<link rel="stylesheet" href="/WDP/demo/css/WDPDemo.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<form action="login" method="POST">
		<div class="loginBackground">
			<div class="loginContainer">
				<div class="setWidth">
					<s:textfield name="username" label="Username" class="setPadding" autocomplete="off" />
				</div>
				<div class="setWidth">
					<s:password name="password" class="setPadding" label="Password " />
				</div>
				<div class="setWidth">
					<s:submit value="Submit" class="setPadding" id="submitForm" />
				</div>
			</div>
		</div>
	</form>
</body>
</html>