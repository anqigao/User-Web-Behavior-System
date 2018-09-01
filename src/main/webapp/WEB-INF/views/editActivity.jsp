<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Activity Record</title>
</head>
<body>

<div class="editDIV">

    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">Edit User ACTIVITY</h3>
        </div>
        <div class="panel-body">

            <form method="POST" action="/unicomSystem/updateActivity/edit" role="form">
                <table class="editTable">
                    <tr>
                        <td>Id:</td>
                        <td><input type="text" name="student_id" id="student_id" value="${act.id}"></td>
                    </tr>
                    <tr>
                        <td>Url:</td>
                        <td><input type="text" name="url" id="name" value="${act.url}">
                        </td>
                    </tr>
                    <tr>
                        <td>Time:</td>
                        <td><input type="text" name="time" id="name" value="${act.time}"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${act.id}">
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