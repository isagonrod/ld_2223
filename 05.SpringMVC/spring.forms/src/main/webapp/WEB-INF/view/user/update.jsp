<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Spring forms :: Users</title>

<!-- Bootstrap -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Users app</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="<s:url value="/assignments" />"
						title="View Users">View assigments</a></li>
					<li><a href="<s:url value="/users/" />" title="View users">View
							users</a></li>
					<li class="active"><a href="<s:url value="/users/new" />"
						title="New user">New user</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
	<div class="container">
		<div class="jumbotron">
			<h1>Update user</h1>
		</div>
		<s:url var="action" value="/users/saveupdate" />
		<sf:form method="post" action="${action}" modelAttribute="user">
			<sf:hidden path="id" />
			<div class="form-group">
				<label for="login">Login</label>
				<sf:input path="login" class="form-control" placeholder="Login" />
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<sf:input path="password" class="form-control" type="password"
					placeholder="Password" />
			</div>
			<div class="form-group">
				<label for="description">Description</label>
				<sf:textarea path="description" class="form-control"
					placeholder="Description" />
			</div>
			<sf:button class="btn btn-primary pull-right">Update</sf:button>
		</sf:form>

		<footer class="footer">
			<div class="container">
				<p class="text-muted">&copy; 2015 Eugenia P�rez</p>
			</div>
		</footer>
</body>
</html>
