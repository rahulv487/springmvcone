<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Mobile</title>
</head>
<body>
<table>
<fo:form action="addData" method="post" modelAttribute="my">

<tr>
<td>Mobile Id </td>
<td><fo:input path="mobId"/>
<td><fo:errors path="mobId"></fo:errors>
</tr>

<tr>
<td>Mobile Name </td>
<td><fo:input path="mobName"/>
<td><fo:errors path="mobName"></fo:errors>
</tr>

<tr>
<td>Mobile Price </td>
<td><fo:input path="mobPrice"/>
</tr>
<tr>
<td>Mobile Category</td>
<td><fo:select path="mobCategory" items="${cato}"></fo:select>
</tr>
<tr>
<td>Online?</td>
<td><fo:radiobutton id="a" path="choice" value = "Yes"></fo:radiobutton>Yes
<fo:radiobutton id="a" path="choice" value = "No"></fo:radiobutton>No
<tr>
<td>
<input type ="submit" value = "Add Mobile"/>
</td>
</tr>

</fo:form>



</table>
</body>
</html>