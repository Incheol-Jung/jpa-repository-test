<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Jpa Repository Page</title>
</head>
<body>
    <h1>Hello JPA!!</h1>
    <c:forEach var="item" items="${items}" varStatus="items">
        <p>${item.id} / <c:out value="${item.itemName}" /> / <c:out value="${item.person.name}" /> </p>
    </c:forEach>
</body>
</html>
