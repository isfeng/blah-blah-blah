<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><decorator:title /></title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/style.css" />
</head>
<body>

	<div class="header">
		<c:if test="${sessionScope.email!=null}">
			<h1>Hello <c:out value="${sessionScope.email}"/></h1>
			<a href="${pageContext.request.contextPath}/Logout.action">Logout</a>
		</c:if>
		<h1>======================================</h1>
	</div>

	<div class="body">
		<decorator:body />
	</div>

	<div class="footer">
		<h1>======================================</h1>
	</div>
</body>
</html>