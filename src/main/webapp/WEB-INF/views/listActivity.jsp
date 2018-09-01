<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All ACTIVITY</title>
</head>
<body>

<h1>Here is all user ACTIVITY records</h1>
<a href="/unicomSystem/listUser">Full table</a>

<div class="listDIV">
    <table class="table table-striped table-bordered table-hover table-condensed">

        <caption>User List - ${total} in total</caption>
        <thead>
        <tr class="success">
            <th>ID</th>
            <th>Url</th>
            <th>Time</th>
            
            <th>Edit</th>
            <th>Delete</th>			
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${acts}" var="a" varStatus="status">
            <tr>
                <td>${a.id}</td>
				<td>${a.url}</td>
				<td>${a.time}"</td> 
				
				
				<td><a href="/unicomSystem/editActivity/${a.id}"><span class="glyphicon glyphicon-edit"></span>click</a></td>
                <td><a href="/unicomSystem/deleteActivity/${a.id}"><span class="glyphicon glyphicon-trash"></span>click</a></td>
				              				 
            </tr>
        </c:forEach>
	
        </tbody>
    </table>
</div>

<div>
<a href="/unicomSystem/addActivity">Add a new Activity Record</a>
</div>


</body>
</html>