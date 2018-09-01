<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

	<%-- JQuery and Bootstrap --%>
    <script src="/unicomSystem/js/jquery/jquery-2.1.4.min.js"></script>
    <link href="/unicomSystem/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <script src="/unicomSystem/js/bootstrap/bootstrap.min.js"></script>
    <link href="/unicomSystem/css/style.css" rel="stylesheet">

	<title>List All Users</title>
</head>
<body>

<h1>Here is all user records</h1>

<div class="listDIV">
    <table class="table table-striped table-bordered table-hover table-condensed">

        <caption>User List - ${total} in total</caption>
        <thead>
        <tr class="success">
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>Url</th>
            <th>Time</th>
			
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${users}" var="u" varStatus="status">
            <tr>
                <td>${u.id}</td>
                <td>${u.firstName}</td>
            	<td>${u.lastName}</td>
                <td>${u.age}</td>
                <c:forEach items="${u.activity}" var="a" varStatus="status">
					<td>${a.url}</td>
					<td>${a.time}</td>
				</c:forEach>
                				 
            </tr>
        </c:forEach>
	
        </tbody>
    </table>
</div>

<div>
<a href="/unicomSystem/listInfo">Info list</a>
</div>
<div>
<a href="/unicomSystem/listActivity">Activity list</a>
</div>


</body>
</html>