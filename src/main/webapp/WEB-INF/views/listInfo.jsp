<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Users</title>
</head>
<body>

<h1>Here is all user records</h1>
<a href="/unicomSystem/listUser">Full table</a>

<div class="listDIV">
    <table class="table table-striped table-bordered table-hover table-condensed">

        <caption>User List - ${total} in total</caption>
        <thead>
        <tr class="success">
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
			
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${users}" var="u" varStatus="status">
            <tr>
                <td>${u.id}</td>
                <td>${u.firstName}</td>
            	<td>${u.lastName}</td>
                <td>${u.age}</td>
                
				 
                <td><a href="/unicomSystem/editInfo/${u.id}"><span class="glyphicon glyphicon-edit"></span>click</a></td>
                <td><a href="/unicomSystem/deleteInfo/${u.id}"><span class="glyphicon glyphicon-trash"></span>click</a></td>				
				 
            </tr>
        </c:forEach>
	
        </tbody>
    </table>
</div>

<div>
<a href="/unicomSystem/addInfo">Add a new Info Record</a>
</div>

</body>
</html>