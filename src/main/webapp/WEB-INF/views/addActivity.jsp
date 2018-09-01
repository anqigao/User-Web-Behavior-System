<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Activity Record</title>
</head>
<body>

<div class="addDIV">

    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">Add User ACTIVITY</h3>
        </div>
        <div class="panel-body">

            <form method="POST" action="/unicomSystem/updateActivity/add" role="form">
                <table class="addTable">
                    <tr>
                        <td>Id:</td>
                        <td><input type="text" name="id" id="id" placeholder="6"></td>
                    </tr>
                    <tr>
                        <td>Url:</td>
                        <td><input type="text" name="url" id="url" placeholder="http://www.google.com"></td>
                    </tr>
                    <tr>
                        <td>Time:</td>
                        <td><input type="datetime" name="time" id="time" placeholder="YYYY-MM-DD HH:MM:SS"></td>
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