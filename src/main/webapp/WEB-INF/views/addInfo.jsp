<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Info Record</title>
</head>
<body>

<div class="addDIV">

    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">Add User INFO</h3>
        </div>
        <div class="panel-body">

            <form method="POST" action="/unicomSystem/updateInfo/add" role="form">
                <table class="addTable">
                    <tr>
                        <td>Id:</td>
                        <td><input type="text" name="id" id="id" placeholder="6"></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="firstName" id="name" placeholder="James"></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastName" id="name" placeholder="Smith"></td>
                    </tr>
                    <tr>
                        <td>Age:</td>
                        <td><input type="text" name="age" id="age" placeholder="18"></td>
                    </tr>

                    <tr class="submitTR">
                        <td colspan="2" align="center">
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