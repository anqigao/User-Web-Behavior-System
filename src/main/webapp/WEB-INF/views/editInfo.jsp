<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Info Record</title>
</head>
<body>

<div class="editDIV">

    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">Edit User INFO</h3>
        </div>
        <div class="panel-body">

            <form method="POST" action="/unicomSystem/updateInfo/edit" role="form">
                <table class="editTable">
                    <tr>
                        <td>Id:</td>
                        <td><input type="text" name="student_id" id="student_id" value="${info.id}"
                                   placeholder="6"></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="firstName" id="name" value="${info.firstName}" placeholder="James">
                        </td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastName" id="name" value="${info.lastName}" placeholder="Smith"></td>
                    </tr>
                    <tr>
                        <td>Age:</td>
                        <td><input type="text" name="age" id="age" value="${info.age}" placeholder="18"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${info.id}">
                            <button type="submit" class="btn btn-success">Submit</button>
                        </td>

                    </tr>

                </table>
            </form>
        </div>
    </div>

</div>



</body>
</html>